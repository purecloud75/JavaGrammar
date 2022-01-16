package chap8.Interface;

public class SmartTelevisionExam {
    public static void main(String[] args) {

        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        //얘는 3개의 메소드에 접근가능
        Searchable se = tv;
        //얘는 search() 하나만 접근가능

        se.search("Google");

        rc.turnOff();
        rc.setVolume(5);
        rc.turnOff();
    }
}

/*
SmartTelevision 클래스는 인터페이스1과 2 모두를 구현하고있는 다중 인터페이스 구현 클래스이다.
인터페이스1의 참조타입변수에 구현객체를 할당하면, 해당 인터페이스타입(1)에서 선언한 메소드와 상수에만 접근이 가능하다. 2에는 접근이 안되네.

인터페이스는 생성자호출이 안되지 즉, 객체생성이 안되지 그래서 인터페이스를 구현하는 클래스의 객체를 넣고
만약 다중 인터페이스 구현클래스의 객체를 특정 인터페이스 타입변수에 할당할 때는, 그 인터페이스에 선언된 멤버에만 접근이 가능한데
이때 이 인터페이스 타입변수를 매개변수든 필드든 로컬변수든 쓸 때, 한마디로 구현객체의 일부를 쓰고 있는 것이다. 나머지는 숨김기능!
 */
