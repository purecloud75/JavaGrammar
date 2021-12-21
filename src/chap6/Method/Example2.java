package chap6.Method;

public class Example2 {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator();
        myCalc.execute();


        Car myCar = new Car();
        myCar.KeyTurnOn();
        myCar.run1();
        int speed = myCar.getSpeed();
        System.out.println("현재속도는 " + speed + "km/h이다.");


        overLoading subj = new overLoading();
        int num1 = subj.plus(10, 20);
        double num2 = subj.plus(10.5, 20.3);
        double num3 = subj.plus(10, 20.3);
        System.out.println(num1 + ", " + num2 + ", " + num3);


        double rec1 = subj.areaRec(10);
        double rec2 = subj.areaRec(10, 20);
        System.out.println("정사각형의 넓이:" + rec1);
        System.out.println("직사각형의 넓이:" + rec2);
    }
}

/*
num3의 경우는 매개변수가 int, double 이어서 컴파일 에러가 날 것 같지만 plus(double,double)이 실행된다.
JVM 은 일차적으로 매개변수의 타입을 보지만 매개변수의 타입이 일치하지 않을 경우, 자동타입변환이 가능한지 검사한다.
작은데에서 큰데로는 자동타입변환되니까 이게 가능한 것이다. 생성자뿐만아니라 메소드도 오버로딩가능하다. 시그니처달라야지(타입과 개수) + 동일이름
 */