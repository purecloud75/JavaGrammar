package chap06.Test3;

public class Student {

    String studentName;
    int allowance;

    public Student(String studentName, int allowance) {
        this.studentName = studentName;
        this.allowance = allowance;
    }

    public void takeBus(Bus bus) {  //버스를 탈때 이 메소드가 호출된다.
        bus.take(1000);
        this.allowance = allowance - 1000;
    }
    public void getOffBus(Bus bus) {
        bus.getOff();
    }

    public void getOffSubway(Subway subway) {
        subway.getOff();
    }

    public void takeSubway(Subway subway) {  //지하철을 탈때 이 메소드가 호출된다.
        subway.take(1200);
        this.allowance = allowance - 1200;
    }

    public void showInfo() {
        System.out.println(studentName + " 님의 남은 돈은 " + allowance + "원 입니다.");
    }
}

//실행클래스에서 정은비, 에릭남 등을 만들때마다 각자는 이 스튜던트 클래스의 것들을 다 가지고있는거야. 해당 페이지가 여러개 복사되는거지
//각각의 필드값만 다른 채로!