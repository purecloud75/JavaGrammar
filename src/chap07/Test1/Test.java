package chap07.Test1;

public class Test {
    public static void main(String[] args) {

        Customer Jung = new Customer(20150115, "정은비");
        Jung.bonusPoint = 3000;
        int finalPrice = Jung.calcPrice(10000); //같은 타입의 경우는 상위클래스의 메소드가 호출됨
        System.out.println(Jung.showCustomerInfo() + "그리고 최종 금액은 " + finalPrice + "원 입니다.");


        VIPCustomer Nam = new VIPCustomer(20130123, "남윤도");
        Nam.bonusPoint = 3000;
        int finalPrice1 = Nam.calcPrice(10000); //같은 타입의 경우는 당연히 재정의되어있든 별도의 함수건 하위클래스의 메소드가 호출됨
        System.out.println(Nam.showCustomerInfo() + "그리고 최종 금액은 " + finalPrice1 + "원 입니다.");


        GoldCustomer Kang = new GoldCustomer(20181026, "강혜원");
        Kang.bonusPoint = 3000;
        int finalPrice3 = Kang.calcPrice(10000);
        System.out.println(Kang.showCustomerInfo() + "그리고 최종 금액은 " + finalPrice3 + "원 입니다.");

        Customer Shin = new VIPCustomer(); //자식객체가 부모타입으로 변환되어서 부모타입의 멤버에만 접근가능. 생성자도 마찬가지.
        int finalPrice2 = Shin.calcPrice(10000); //상위타입으로 업캐스팅(위로 형변환)되었지만, overriding 에 의해 하위꺼가 호출됨.
        System.out.println(finalPrice2);

        if (Shin instanceof VIPCustomer) {
            VIPCustomer vc = (VIPCustomer) Shin;
            //업캐스팅이 된 객체의 경우에만 다운캐스팅이 가능하다. 이 때부터 비로소 자식타입의 멤버에 접근이 가능한거지. 자식객체가.
            vc.printDownCasting();
        }
        else {
            System.out.println("Shin 은 원래 GoldCustomer 타입이 아닙니다.");
        }
    }
}
/*
자식클래스를 생성하면 부모클래스가 먼저 생성됨. vip 의 경우에,
생성자 Customer()가 먼저 호출되고 VIPCustomer()가 생성됨. 그래서 자식의 객체에서도 부모와 자식의 멤버들을 private 이 아니라면 호출 가능!

인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만, 메소드 명령어 set 은 처음 한번만 따로 로드되는데, 그 곳을 바로 메소드영역 이라고한다.
같은 클래스타입의 여러객체들은 같은 함수를 호출할 때, 메소드 영역에 있는 그 하나의 메소드만을 호출하는거지. 공유하는거지.
 */
