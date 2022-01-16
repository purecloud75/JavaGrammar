package chap8.Test3;

public class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }
    //같은 시그니처의 디폴트 메소드가 두 인터페이스 모두에 있어서, 둘 중 하나의 메소드를 아무거나 골라서 그것을 재정의 해주어야 한다.
    //그러면 나머지 다른 하나에서 접근을 해도, 재정의된 메소드는 메소드영역에 있으므로 가상메소드원리, 참조를 하기에 a.order() == b.order()

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void hello() {
        System.out.println("Hello");
    }
}
