package chap6.Method;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }

    void powerOff() {

        System.out.println("전원을 끕니다.");
    }

    double avg(int x, int y) {
        double sum = plus(x, y);  //plus 메소드의 반환값은 분명 int 이지만, 할당받고자하는 변수가 double 형이라서 자동타입변환된대
        double result = sum / 2;  //그래서 여기서 굳이 강제타입변환을 안해도 문제없다.
        return result;
    }

    void execute() {
        double result = avg(7,10);
        println("실행결과: " + result);  //문자열과 다른타입의 +연산의 결과값은 문자열타입이다. 그래서 매개변수타입과 일치하여 호출가능
    }

    void println(String message) {
        System.out.println(message);
    }
}
