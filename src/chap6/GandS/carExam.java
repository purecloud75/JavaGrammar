package chap6.GandS;

public class carExam {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("잘못된 속도: " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("올바른 속도: " + myCar.getSpeed());

        if (!myCar.isStop()) {     //stop 을 리턴하는데, stop 은 초기화가 아직 안됐으므로 기본초기화값인 false 가 들어있다.
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " + myCar.getSpeed());
    }
}
