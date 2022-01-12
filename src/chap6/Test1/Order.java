package chap6.Test1;

public class Order {

    private int phoneNum;
    private long orderNum;
    private String address;
    private int menuNum;

    public void setOrder(int phoneNum, long orderNum, String address, int menuNum) {
        this.phoneNum = phoneNum;
        this.orderNum = orderNum;
        this.address = address;
        this.menuNum = menuNum;
    }

    public void getOrder() {
        System.out.println("주문번호: " + orderNum);
        System.out.println("휴대폰 번호: " + phoneNum);
        System.out.println("주소: " + address);
        System.out.println("메뉴번호: " + menuNum);
    }
}
