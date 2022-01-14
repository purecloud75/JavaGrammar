package chap7.Test1;

public class Test {
    public static void main(String[] args) {

        Customer Jung = new Customer(20150115, "정은비");
        Jung.bonusPoint = 750;
        int finalPrice = Jung.calcPrice(10000); //같은 타입의 경우는 상위클래스의 메소드가 호출됨
        System.out.println(Jung.showCustomerInfo() + "그리고 최종 금액은 " + finalPrice + "원 입니다.");

        VIPCustomer Nam = new VIPCustomer(20130123, "남윤도");
        Nam.bonusPoint = 3000;
        int finalPrice1 = Nam.calcPrice(10000); //같은 타입의 경우는 당연히 재정의되어있든 별도의 함수건 하위클래스의 메소드가 호출됨
        System.out.println(Nam.showCustomerInfo() + "그리고 최종 금액은 " + finalPrice1 + "원 입니다.");

        Customer Shin = new VIPCustomer();
        int finalPrice2 = Shin.calcPrice(10000); //상위타입으로 업캐스팅(위로 형변환)되었지만, overriding 에 의해 하위꺼가 호출됨.
        System.out.println(finalPrice2);
    }
}
/*
자식클래스를 생성하면 부모클래스가 먼저 생성됨. vip 의 경우에,
생성자 Customer()가 먼저 호출되고 VIPCustomer()가 생성됨. 그래서 자식의 객체에서도 부모와 자식의 멤버들을 private 이 아니라면 호출 가능!

인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만, 메소드 명령어 set 은 처음 한번만 따로 로드되는데, 그 곳을 바로 메소드영역 이라고한다.
같은 클래스타입의 여러객체들은 같은 함수를 호출할 때, 메소드 영역에 있는 그 하나의 메소드만을 호출하는거지. 공유하는거지.
메소드(함수)의 이름이 곧 주소값이야. 해당 메소드가 저장되어있는 메소드영역 내의 특정 공간의 주소!
 */
