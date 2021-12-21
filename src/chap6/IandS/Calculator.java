package chap6.IandS;

public class Calculator {

    static double pi = 3.14159;     //어느 객체에서나 pi는 항상 같은 값이므로 변할 필요가 없으므로 정적 필드 선언

    static int plus(int x, int y) { //인스턴스 필드가 쓰이지않고 오로지 매개변수만 쓰이기에 정적 메소드 선언
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
}
//객체가 없어도 실행된다는 특징 때문에 정적 메소드를 선언 시, 이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용 못한다. psvm 떠올려라 아래것.
//객체 자신의 참조인 this 역시 사용 못함. 정적 메소드에서 인스턴스 멤버를 사용하고 싶다면 블록 안에서 객체를 생성하고 참조변수로 접근해야한다.
//클래스 외부란? 하나의 소스파일(=하나의 클래스이다. 적어도 자바에서는!)을 제외한 모든 곳을 칭한다.
