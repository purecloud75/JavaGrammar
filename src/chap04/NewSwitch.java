package chap04;

public class NewSwitch {
    public static void main(String[] args) {

        int month = 10;

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
                //키워드 yield 를 이용하여 반환값을 변수 day 에 할당한다
                //컴마로 여러 케이스를 한 번에 묶을 수 있다
                //break;는 안쓰고 콜론대신 화살표를 쓰며 중괄호를 쓴다
            }
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                yield -1;
            }
        };

        System.out.println(month + "월은 총 " + day + "일까지 존재합니다.");
    }
}
