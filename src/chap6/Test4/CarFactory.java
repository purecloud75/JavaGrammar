package chap6.Test4;

public class CarFactory {

    private static CarFactory singleton = new CarFactory();
    //딱 하나라는 것을 강조하기위해? 기준값의 역할로써? static 을 붙인다.

    private CarFactory() {}

    Car createCar() {
        Car car = new Car();
        return car;
    }

    public static CarFactory getInstance() {
        return singleton;
    }
}
