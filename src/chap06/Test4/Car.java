package chap06.Test4;

public class Car {

    private static int carNumber = 10000;
    //static 이 있기에 데이터영역에 별도로 존재하여 스택영역의 참조변수가 얘를 참조함. 즉 지역변수에 그치지않고 ++1 이 누적됨.
    private int num;

    public Car() {
        carNumber++;
        num = carNumber;
    }


    int getCarNum() {
        return num;
    }
}
