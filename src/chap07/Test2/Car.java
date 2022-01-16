package chap07.Test2;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}
    //이래봬도 구현이 된 메소드이다. 모든 실체(자식)클래스 말고 일부에게만 재정의하고싶으면 추상메소드가 아닌 구현내용없는 overriding 으로

    final public void run() {
        startCar();
        drive();
        washCar();
        stop();
        turnOff();
    } //재정의가 안되게 final. 순서대로 유지가 되어야 정상작동하므로 재정의 못하게 해 놓음.
}
/*
템플릿 메소드
추상메소드나 구현된 메소드를 활용하여 코드의 흐름(시나리오)를 정의하는 메소드
final 로 선언하여 하위 클래스에서 재정의 할 수 없게 함
프레임워크에서 많이 사용하는 설계 패턴
추상클래스로 선언된 상위클래스에서 템플릿 메소드를 활용하여 전체적인 흐름을 정의하고, 하위클래스에서 다르게 구현되어야 하는 부분은
추상메소드로 선언하여 하위클래스에서 구현하도록 함. run().
 */