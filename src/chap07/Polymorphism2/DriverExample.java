package chap07.Polymorphism2;

public class DriverExample {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Bus bus = new Bus();          //자식객체들 생성
        Taxi taxi = new Taxi();

        driver.drive(bus);  //버스가 달립니다.
        //Driver 클래스의 메소드인 drive()를 호출. 매개변수를 부모객체로 해야하지만 자식객체도 가능. 그렇게 자식객체가 매개값으로 들어가면
        //자동타입변환이 일어나서. 대신 참조타입변수 vehicle 은 부모클래스에만 접근할 수 있는데, run()과 같은 재정의된메소드는 자식 접근!
        //그래서 부모클래스의 차량이달립니다가 아니고 자식클래스에서 재정의된 대로 실행됨을 알 수 있다.
        driver.drive(taxi); //차량이 달립니다. 재정의가되지 않았기에 원래의도대로 부모클래스의 run()이 실행된 모습.
    }
}
