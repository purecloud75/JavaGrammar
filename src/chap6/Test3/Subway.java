package chap6.Test3;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int income;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void take(int cost) {
        this.income = income + cost;
        passengerCount++;
    }

    public void getOff() {
        passengerCount--;
    }

    public void showSubwayInfo() {
        System.out.println(subwayNumber + "의 승객 수는 " + passengerCount + "명 이고, 수입은 " + income + "원 입니다.");
    }
}
