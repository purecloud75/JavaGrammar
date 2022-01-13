package chap6.Test1;

public class Test {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.printAll();

        Person person2 = new Person(178,80,"남성","Tomas",37);
        person2.printAll();
        System.out.println(person2);
        Person cho = person2.getPerson();
        //어떤 객체에서 이 메소드를 호출하면, 해당 객체 자신의 주소값을 반환해주는 데에 this 가 쓰인다.
        System.out.println(cho);

        Order order1 = new Order();
        order1.setOrder(12345678,202201120003L,"서울시 어딘가",0003);
        order1.getOrder();
    }
}
