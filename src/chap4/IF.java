package chap4;

public class IF {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        //이 메소드는 0.0 ~ 1.0 중에서 난수생성을 함. int(0.0 ~ 6.0) + 1 = 1.0 ~ 6.999(1부터 6)

        switch (num) {
            case 1:
                System.out.println("1번이 나왔습니다!");
                break;
            case 2:
                System.out.println("2번이 나왔습니다!");
                break;
            case 3:
                System.out.println("3번이 나왔습니다!");
                break;
            case 4:
                System.out.println("4번이 나왔습니다!");
                break;
            case 5:
                System.out.println("5번이 나왔습니다!");
                break;
            default:
                System.out.println("6번이 나왔습니다!");
                break;
        }
    }
}

/*
switch 문은 변수의 값에 따라서 실행문이 결정됩니다. break 가 붙어있는 이유는 다음 case 를 실행하지않고 switch 문을 빠져나오기 위함이다
switch 문에서 괄호안에 쓰이는 변수의 타입은 정수형 문자형 문자열형까지 다 된다.
 */