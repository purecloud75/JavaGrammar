package chap08.Test2;

//인터페이스 Calc 에 있는 4개의 추상메소드 중 단 2개만 구현하였으므로 오류인데, 추상클래스로 선언함으로써 이 친구의 자식클래스에서 마저 재정의!
public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}
