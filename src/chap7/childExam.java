/*
package chap7.Polymorphism;

public class Parent {

    public void method1() {
        System.out.println("Parent-method1()");
    }
    public void method2() {
        System.out.println("Parent-method2()");
    }
}

public class Child extends Parent {

    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }

    public void method3() {
        System.out.println("Child-method3()");
    }
}

public class childExam {
    public static void main(String[] args) {

        Child child = new Child();

        Parent parent = child;  //자동타입변환
        parent.method1();
        parent.method2();       //메소드재정의를 하였기에 예외적으로 자식클래스의 메소드를 호출
        parent.method3();       //부모클래스의 메소드만 접근가능하므로 컴파일에러

    }

    Parent-method1()
    Child-method2()
}*/
