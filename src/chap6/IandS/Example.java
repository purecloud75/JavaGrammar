package chap6.IandS;

public class Example {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");

        myCar.run();
        yourCar.run();

        //정적 멤버에 접근하고싶다면, 해당 클래스타입의 객체를 만들 필요없이  클래스이름.멤버  이런 식으로 바로 접근 가능하다!
        double result1 = 10 * 10 * Calculator.pi;
        int num1 = Calculator.plus(10, 5);
        int num2 = Calculator.minus(10, 5);
        System.out.println(result1 + ", " + num1 + ", " + num2);


        //Singleton obj1 = new Singleton(); 싱글톤 클래스에서 생성자 앞에 private 을 붙여주었다. 이 곳은 걔 입장에서는 외부이므로
        //Singleton obj2 = new Singleton(); 외부에서 new 를 통해 생성자를 사용할 수가 없다. 즉 이런 방식으로 객체 생성 불가!
        Company obj1 = Company.getInstance(); // getIn 이 메소드는 정적(static) 메소드이므로 클래스이름.메소드() 바로접근!
        Company obj2 = Company.getInstance(); // 두 참조변수에는 단 하나의 객체 주소값이 할당되어 있다.

        if (obj1 == obj2) {
            System.out.println("같은 싱글톤 객체입니다.");
        } else {
            System.out.println("다른 싱글톤 객체입니다.");
        }


        Person p1 = new Person("123-456", "John");
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //p1.ssn = "456-123"; 요 두 줄은 컴파일에러. 파이널 필드는 수정이 불가하다.
        p1.name = "Anna";


        System.out.println("지구의 반지름: " + Person.EARTH_RADIUS);
        System.out.println("지구의 표면적: " + Person.EARTH_AREA);
    }
}
