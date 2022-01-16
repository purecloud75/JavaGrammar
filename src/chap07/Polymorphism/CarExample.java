package chap07.Polymorphism;

//자동차를 구성하는 부품은 고장날 수도 있고, 성능이 더 좋은 부품으로 교체되기도 합니다.
//프로그램은 수많은 객체들이 서로 연결되고 각자의 역할을 하게 되는데, 이 객체들은 다른 객체로 교체될 수 있어야 합니다. "다형성"
public class CarExample {
    public static void main(String[] args) {

        Car car = new Car();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;

                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    break;

                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;

                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽", 17);
                    break;
            }
            System.out.println("--------------------------");
        }
    }
}
//부모객체 대신 자식객체를 할당해도 문제가 없다. 자식타입은 부모타입으로 자동타입변환이 되기 때문이다.
//자동타입변환이 되면 부모클래스의 멤버에만 접근이 가능한데, 자식객체에는 부모인 Tire 의 멤버를 가지고 있어서 전혀 문제가 없다.
//단 자식클래스에서 메소드가 재정의되었다면 그 메소드에 한하여 예외적으로 자식클래스에 접근이 가능하다.