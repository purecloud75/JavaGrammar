package chap6.Test3;

public class Test {
    public static void main(String[] args) {

        Student Jung = new Student("eunbi", 5000);
        Student Nam = new Student("yoondo", 10000);

        Bus bus4432 = new Bus(4432);
        Bus bus452 = new Bus(452);
        Subway subway2 = new Subway(2);
        //여기까지 해당 값을 갖는 학생 2명과, 버스 2대, 지하철 1대가 실체화가되어 세상에 나타났다!

        Nam.takeSubway(subway2);
        //이 과정을 거치면서 지하철의 수입과 승객수는 늘고, 윤도의 용돈은 1200원 줄었다.
        Jung.takeBus(bus4432);
        //마찬가지로 버스의 수입과 승객수는 늘고, 은비의 용돈은 1000원 줄어들었다. 객체를 매개변수로 보냄으로서 협력한다.
        Nam.getOffSubway(subway2);
        Nam.takeBus(bus452);
        Jung.getOffBus(bus4432);
        Jung.takeBus(bus452);
        //4432는 1000원,0명    지하철은 1200원,0명   452는 2000원,2명   은비는 3000원  윤도는 7800원 일 것 같다. 맞음.

        Jung.showInfo();
        Nam.showInfo();
        bus4432.showBusInfo();
        subway2.showSubwayInfo();
        bus452.showBusInfo();
        //실행클래스에서는 버스입장에서, 지하철입장에서, 학생입장에서의 각각의 정보를 보여준다. 어느 한 클래스가 주체가 아님을 알 수 있다.
    }
}
