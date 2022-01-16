package chap7.Test1;

import java.util.ArrayList;

import chap7.Test1.Customer;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerArrayList = new ArrayList<>(); //Customer 타입의 객체 여러개가 일렬로 모여있는 기차임.

        Customer Kim = new Customer(1, "Kim");
        Customer Qim = new Customer(2, "Qim");
        Customer Wim = new GoldCustomer(3, "Wim");
        Customer Eim = new GoldCustomer(4, "Eim");
        Customer Rim = new VIPCustomer(5, "Rim");

        customerArrayList.add(Kim);
        customerArrayList.add(Qim);
        customerArrayList.add(Wim);
        customerArrayList.add(Eim);
        customerArrayList.add(Rim);
        //각 방에 Customer 타입의 객체(순수혈통이던 자식객체의 업캐스팅에 의한것이던 간에 말이다)

        for (Customer consumer : customerArrayList) { //Kim 서부터 Rim 까지 차례로 consumer 에 들어가서 차례로 실행되는 것이다.
            System.out.println(consumer.showCustomerInfo());
            //부모클래스에있는, 재정의가 안된 메소드이므로 5개의 경우 모두 당연히 접근가능하다.
        }

        for (Customer consumer : customerArrayList) {
            int money = consumer.calcPrice(10000);
            //일단 부모클래스에 먼저갔다가 어? overriding 이네? 자식으로 내려가서 그 놈을 호출한다. 자동타입변환의 경우만!
            System.out.println(consumer.customerName + "님은 " + consumer.bonusPoint + "P 적립, 금액 " + money + "원");
            //코드는 똑같지만 결과가 다 다르게 나오는 경우에 이것을 "다형성"이라고 한다.
        }
    }
}
