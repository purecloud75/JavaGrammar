package chap06.Method;

public class Example {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();  //생성자가 없지만, 컴파일러가 알아서 디폴트생성자를 만들어주기에 걱정없다.
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);  //클래스(설계도)를 실체화한 것이 바로 객체(인스턴스)이다.
        System.out.println(result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalc.divide(x, y);   // byte 가 int 로 자동타입변환되었기에 문제없다.
        System.out.println(result2);

        myCalc.powerOff();


        Computer myCom = new Computer();
        int[] arr1 = {1, 2, 3};
        int num1 = myCom.sum1(arr1);
        System.out.println(num1);

        int num2 = myCom.sum1(new int[]{1, 2, 3, 4, 5});
        System.out.println(num2);

        int num3 = myCom.sum2(1, 2, 3, 4, 5);
        System.out.println(num3);

        int num4 = myCom.sum2(arr1);
        System.out.println(num4);
        
        
        Car myCar = new Car();  //new 는 밑그림, Car()은 채색. 그렇게해서 완성된 객체의 주소값을 변수 myCar 에 주면 이게 인스턴스!
        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.out.println("출발합니다.");
            myCar.run();
        }
        
        if(myCar.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요");
        }
    }
}
