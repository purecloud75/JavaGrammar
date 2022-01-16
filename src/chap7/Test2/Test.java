package chap7.Test2;

public class Test {
    public static void main(String[] args) {

        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("====================");
        //얘는 부모타입으로 자동타입변환되었기에 당연히 부모타입에만 접근이 된다.

        AICar car1 = new AICar();
        car1.run();
        System.out.println("====================");
        //비록 자식객체를 자식타입변수에 할당했지만 얘는 부모타입에도 접근가능하다.
        //부모객체가 먼저생성되고 자식객체가 생성되어 힙영역에 나란히 놓여져, 자식이 부모와 자식에 모두 접근가능!

        Car manualCar = new ManualCar();
        manualCar.run();
    }
}

