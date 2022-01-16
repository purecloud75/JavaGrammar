package chap04;

public class Looping {
    public static void main(String[] args) {

        for (int i = 2; i <= 4; i++) {
            System.out.println("***" + i + "단 ***");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }


        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);


        int num = 1;
        do {
            System.out.println("Hello");
            num++;
        } while (num <= 5);


        Outter:
        for (char up = 'A'; up <= 'Z'; up++) {
            for (char low = 'a'; low <= 'z'; low++) {
                System.out.println(up + "-" + low);
                if (low == 'g') {
                    break Outter;  //break Label; 하면 중첩반복문을 한번에 나올 수 있다.
                }
            }
        }


        for (int j = 1; j <= 10; j++) {
            if (j % 2 != 0) {  //즉 홀수이면 continue 문이 실행되면서 그 아래 출력코드는 실행안되고 증감식으로 넘어감.
                continue;
            }
            System.out.println(j);
        }
        System.out.println("짝수출력 완료!");
    }
}
 /*
 break 문은 대개 if 문과 같이 사용되어, if 문의 조건식에 따라 for 문과 while 문을 종료할 때 사용함. 얘를 만나면 반복문 탈출.
 break 만나면 가장 가까운 반복문만 종료시키므로 중첩을 한번에 종료하고싶다면 위에 처럼 라벨(Outter)을 활용한다.

 continue 문도 대개 if 문과 같이 사용되는데, continue 를 만나면 그 이후의 문장을 실행하지 않고, 다음 반복으로 넘어감.
 그 아래 코드는 무시하고 for 의 증감식, while 의 조건식으로 돌아감.
  */