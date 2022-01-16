package chap08.Interface_Inheritance;

public class Exam {
    public static void main(String[] args) {

        InCImplement lower = new InCImplement();

        InA ia = lower;
        InB ib = lower;
        InC ic = lower;
        //하위 인터페이스 구현 클래스의 객체를, 하위와 상위 인터페이스타입의 참조변수에 할당하는 모습

        ia.methodA();

        ib.methodB();

        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}

/*
하위 인터페이스 구현클래스는 하위와 상위의 모든 추상메소드에 대해 다 실체메소드로서 재정의 되어있어야 한다. 
그렇기에 구현 객체가 하위뿐만아니라 상위까지도 자동타입변환이 가능하다.
상위 인터페이스타입에 하위 구현객체가 할당된 경우, 해당 인터페이스에 있는 메소드만 접근가능하므로 methodA()에만 혹은 methodB()에만 접근가능
 */