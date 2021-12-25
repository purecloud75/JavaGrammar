package chap7.Override;

public class AirPlaneExam {
    public static void main(String[] args) {

        SuperSonicAirPlane air = new SuperSonicAirPlane();
        air.takeOff();
        air.fly();  //자식클래스의 fly()로 가서 if 조건문이 거짓이니까 super.fly()실행되서 부모메소드가 호출된다.
        air.flyMode = SuperSonicAirPlane.SUPERSONIC; //static 이어서 객체없이 바로 호출 가능하다.
        air.fly();  //이번에는 if 조건문이 참이어서 메소드재정의 한대로 수행된다.
        air.flyMode = SuperSonicAirPlane.NORMAL;
        air.fly();  //다시 부모메소드를 호출
        air.land();
    }
}
