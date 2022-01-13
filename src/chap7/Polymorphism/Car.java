package chap7.Polymorphism;

public class Car {

    //필드. Tire 클래스타입의 참조타입변수 4개를 선언하고, new 를 통해 각각에 별도의 Tire 클래스타입의 객체를 생성하여 주소값을 부여함.
    Tire frontLeftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backLeftTire = new Tire("뒤왼쪽", 3);
    Tire backRightTire = new Tire("뒤오른쪽", 4);  //자동차는 4개의 타이어를 가짐. 객체는 부품이다.

    //생성자(없음)
    //메소드
    int run() {
        System.out.println("[자동차가 달립니다.]");
        if (frontLeftTire.roll() == false) {
            stop();
            return 1;
        }
        if (frontRightTire.roll() == false) {
            stop();
            return 2;
            //Tire 라는 부모클래스타입인 frontRightTire 라는 참조타입변수에 자식객체인 KumhoTire 를 할당하여 자동타입변환이 발생함
            //그래서 부모타입인 Tire 의 roll()에 접근하지만, 예외적으로 할당된 자식클래스에 재정의된 메소드가 있으므로 그것을 호출한다.
            //각 객체마다 따로있는 평행세계의 accumulatedRotation 이므로 바퀴마다 다 다르다. 자식객체 들어오면 초기화 x -> 0이 들어있다
        }
        if (backLeftTire.roll() == false) {
            stop();
            return 3;
        }
        if (backRightTire.roll() == false) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
