package chap08.Polymorphism;

public class Car {

    //Field
    Tire fLT = new HanKookTire();
    Tire fRT = new HanKookTire();
    Tire bLT = new HanKookTire();
    Tire bRT = new HanKookTire();
    //Tire 인터페이스타입의 참조변수에 Tire 구현클래스 2개중 한국타이어의 객체를 할당한 모습. 저 인터페이스변수 통해 인터페이스에 메소드호출

    //Method
    void run() {
        fLT.roll();
        fRT.roll();
        bLT.roll();
        bRT.roll();
    }
    //인터페이스의 메소드 roll()를 호출한다. 인터페이스에서는 본인이 갖고있는 구현객체에 재정의된 메소드를 호출한다. 그걸 리턴한다.
}
