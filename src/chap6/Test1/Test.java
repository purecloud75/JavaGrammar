package chap6.Test1;

public class Test {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.printAll();

        Person person2 = new Person(178,80,"남성","Tomas",37);
        person2.printAll();

        Order order1 = new Order();
        order1.setOrder(12345678,202201120003L,"서울시 어딘가",0003);
        order1.getOrder();
    }
}
