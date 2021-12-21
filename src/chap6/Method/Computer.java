package chap6.Method;

public class Computer {
    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}

/*
보통은 메소드의 매개변수의 개수가 정해져있지만, 어떨때는 메소드를 선언할 때 매개변수의 개수를 알 수 없는 경우도 있습니다.
해결책은 매개변수를 배열타입으로 선언하는 것이고 배열의 항목 수는 호출할 때 결정된다.
배열말고 점3개 (...) 을 통해서도 값의 목록들을 넘겨줄 수 있다. ...로 선언된 매개변수는 배열타입이므로 호출할 때 배열을 직접 매개값으로 가능!
return 문이 실행되면 메소드는 즉시 종료됩니다.
void 를 리턴타입으로 갖는 메소드에서도 실행문 안에 return; 처럼 반환안하고 단독으로 사용가능. 메소드 실행을 강제 종료하기위해서

외부 클래스에서 메소드를 호출하려면 우선 클래스로부터 객체를 생성해야 한다. 메소드는 객체에 소속된 멤버이므로 객체가 존재하지 않으면
메소드도 존재하지 않기 때문이다.

 */