package chap8.Test3;

public class Test {
    public static void main(String[] args) {

        Customer a = new Customer();
        a.buy();
        a.sell();
        a.order();
        a.hello();

        Buy b = new Customer(); //업캐스팅. 마치 부모타입에 할당된 자식객체. 부모타입에만 접근가능하듯이 해당인터페이스타입에만 접근가능!
        b.buy();
        b.order();

        Sell c = new Customer();
        c.sell();
        c.order();
    }
}
