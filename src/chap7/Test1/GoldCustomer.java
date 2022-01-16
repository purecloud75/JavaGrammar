package chap7.Test1;

public class GoldCustomer extends Customer {

    private double salesRatio;

    public GoldCustomer(int ID, String name) {
        super(ID, name);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        this.salesRatio = 0.1;
        System.out.println("하위GOLD클래스의 생성자가 호출됨");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint = bonusPoint + (int) (price * bonusRatio);
        price = price - (int) (price * salesRatio);
        return price;
    }

}
