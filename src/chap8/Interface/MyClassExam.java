package chap8.Interface;

public class MyClassExam {
    public static void main(String[] args) {

        System.out.println("------------------------");

        MyClass myClass1 = new MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(1);
        //MyClass 에 접근해서 그 안에 선언된 rc 필드에 접근해서 해당 인터페이스의 메소드에 접근해서 그 메소드가 재정의된 구현객체에서 호출

        System.out.println("------------------------");

        MyClass myClass2 = new MyClass(new Audio());
        //이 생성자는 RemoteControl 타입의 매개변수를 이용하는데, 여기 매개값 new Audio()는 RemoteControl 의 구현객체이므로 대입가능

        System.out.println("------------------------");

        MyClass myClass3 = new MyClass();
        myClass3.methodA();

        System.out.println("------------------------");

        myClass3.methodB(new Television());
        myClass3.rc.turnOff();  //TV를 끕니다.
        //methodA 에서 rc 에 new Audio()가 할당되었지만, 그건 블록 내에서만 적용이고 실행끝나고 나오면 다시 rc 에는 Television 이 있다
    }
}
