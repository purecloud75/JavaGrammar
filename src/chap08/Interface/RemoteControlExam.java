package chap08.Interface;

public class RemoteControlExam {
    public static void main(String[] args) {

        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(13);
        rc.turnOff();
        //인터페이스 변수를 통해서 메소드를 호출하고 있다. 이들 메소드는 이 인터페이스 변수에 대입된 Television 구현객체에서 실행되고 있다.

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        //구현클래스 타입의 객체를 생성하고, 그 객체의 주소값을 구현클래스가 구현하고있는 해당 인터페이스타입의 참조타입변수에 할당한다.
    }
}
