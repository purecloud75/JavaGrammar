package chap7.Polymorphism;

public class Tire {

    //필드
    public int maxRotation; //최대회전수 = 타이어수명
    public int accumulatedRotation; //누적 회전수
    public String location;

    //생성자. 부모클래스로 쓸 경우엔 항상 디폴트생성자를 만들어주자. 오류안나고 확실하게.
    public Tire() {}
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    //메소드
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) { //누적회전수가 최대회전수가 되는 순간 타이어가 펑크난다고 가정
            System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println(location + "Tire 펑크");
            return false;
        }
    }
}
