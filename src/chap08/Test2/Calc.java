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
    //디폴트메소드라고 하는데, 구현객체가 반드시 필요하다. 인터페이스에 선언된 인스턴스 메소드이기 때문이다. CalC.description() 불가
    //인터페이스를 구현하는 모든 클래스의 기본메소드라고 생각하면 편하다. 그리고 이들은 각 구현클래스마다 재정의가 가능하다.
    //기존 인터페이스의 이름과 추상메소드의 변경없이 디폴트메소드만 추가하기에, 이전에 개발해놓은 구현클래스를 그대로 사용할 수 있다.
    //그러면서 새롭게 개발하는 클래스는 디폴트메소드를 활용할 수 있다. 기존 구현클래스를 수정할 여건이 안될수도 있는데 이럴때를 위해 만들어짐.

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
