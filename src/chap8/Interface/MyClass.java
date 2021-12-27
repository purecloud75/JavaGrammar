package chap8.Interface;

public class MyClass {

    //Field
    RemoteControl rc = new Television();  //rc 는 구현객체의 일부이다. 구현클래스 전체에서 해당 인터페이스에서 선언된 멤버에만 접근됨

    //Constructor
    MyClass() {
    }

    MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(7);
    }

    //Method
    void methodA() {
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB(RemoteControl rc) {
        rc.turnOn();
        rc.setVolume(8);
    }
}
