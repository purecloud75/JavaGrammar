package chap7.Test1;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("상위 디폴트가 호출됨");
    }
    //하위클래스 생성자안에 super();가 없거나 그냥 super 자체가 없으면 디폴트 super()를 만들어서 상위클래스의 디폴트생성자를 호출하게 함

    public Customer(int ID, String name) {
        customerID = ID;
        customerName = name;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("상위클래스의 생성자가 호출됨");
    }
    //하위클래스의 생성자 첫째줄에서 super(ID, name);을 호출함으로써 상위클래스의 생성자가 먼저 호출되어 진행됨. 그래서 하위객체를 만들면
    //상위클래스의 객체가 먼저생성되고 후에 하위클래스의 객체가 생기는 것이므로, 하위객체에서 상위하위 둘다의 멤버에 접근이 가능하다.
    //힙 영역에 차례로 생성되는거임. 즉, VIPCustomer 타입은 customer 타입을 내포하고 있다고 얘기한다. 그래서 형변환이 가능.

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }
    //상위와는 다르게 하위(VIP)는 보너스포인트에 더해서 할인률 혜택까지 있는거라서 구현코드가 다르다

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + "P 입니다.";
    }
    //하위와 상위가 구현내용까지 똑같은 메소드가 필요하다면, 굳이 재정의를 하위에서 해주지않고 하위객체.메소드() 식으로 바로 접근한다.
}
//뭔가 if 나 else 가 많이쓰인다면 상속을 생각해봐라!!
//중요한것은 하위객체는 상위멤버+하위멤버에 다 접근가능한것이고, 상위객체는 당연히 상위멤버만 접근이 가능하므로 하위가 오히려 더 크다.