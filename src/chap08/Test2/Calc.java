package chap08.Test2;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }
    //한 인터페이스를 수많은 클래스들에서 구현할때 분명 공통된 메소드들도 있을것이다. 그러나 그런 메소드마저
    //각 구현클래스마다 똑같이 구현을하면 너무 비효율적이기에 예외적으로 default 키워드를 통해 인터페이스에서 함수를 정의한다!
    //그리고 이들은 각 구현클래스마다 재정의가 가능하다.

    static int total(int[] arr) {
        int total = 0;
        for (int count : arr) {
            total += count;
        }
        myStaticMethod();
        return total;
    }
    //static 키워드이기에, 인터페이스명.메소드명() 이렇게 바로 호출가능

    private void myMethod() {
        System.out.println("myMethod");
    }
    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
    //private 은 구현클래스에서 접근못하고 재정의 불가(당연하지 private 인데). 오로지 default 와 static 인터페이스 메소드에서만 쓰인다
}
