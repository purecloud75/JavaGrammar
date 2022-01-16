package chap08.Polymorphism;

public class CarExam {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.run();  //클래스를 실체화한것이 객체(인스턴스)이다.

        myCar.fLT = new KumhoTire();
        myCar.fRT = new KumhoTire();

        myCar.run();
    }
}
