package chap7.Test1;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;   //전용 담당 상담원

    public VIPCustomer() {
        super(); //상위클래스의 참조값(주소)를 갖고 있어서 상위클래스의 디폴트생성자를 호출해준다. 안써도 자동생성이므로 무관!
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public VIPCustomer(int ID, String name) {
        super(ID, name);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("하위클래스의 생성자가 호출됨");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) (price * salesRatio);
        return price;
    }
}
