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
