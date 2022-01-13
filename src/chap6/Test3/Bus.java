package chap6.Test3;

public class Bus {

    int busNumber;
    int passengerCount;
    int income;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int cost) {
        this.income = income + cost;
        passengerCount++;
    }

    public void getOff() {
        passengerCount--;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + income + "원 입니다.");
    }
}
