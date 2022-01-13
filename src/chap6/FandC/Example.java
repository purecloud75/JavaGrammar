package chap6.FandC;

public class Example {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car car1 = new Car("genesis");
        Car car2 = new Car("sonata", "Gray"); // 생성자 오버로딩. 매개변수의 개수와 타입이 다르면 동일한 이름 가능.

        System.out.println("제작회사: " + myCar.company); //도트(.) 연산자를 통해 객체의 필드나 메소드에 접근 가능.
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);
        myCar.speed = 60;
        System.out.println("현재속도: " + myCar.speed);

        System.out.println("car1: " + myCar.model + ", " + myCar.color + ", " + myCar.company);
        System.out.println("car1: " + car1.model + ", " + car1.color + ", " + car1.company);
        System.out.println("car2: " + car2.model + ", " + car2.color + ", " + car2.company);


        Korean k1 = new Korean("신현수", "123-456");
        Korean k2 = new Korean("김자바", "234-567");

        System.out.println(k1.name + ", " + k1.ssn);
        System.out.println(k2.name + ", " + k2.ssn);
    }
}

/*
초기값이 지정되지 않은 필드는 객체 생성 시 자동으로 기본 초기값으로 설정됩니다. 필드의 타입에 따라 기본 초기값이 다른데,
정수타입필드는 0, 실수타입필드는 0.0, boolean 필드는 false, String 이나 배열 등의 참조타입은 null 로 초기화됩니다.

필드(멤버변수)의 경우에만 초기값이 있고, 일반 지역변수는 반드시 초기화를 해줘야 오류가 안 난다.
 */
