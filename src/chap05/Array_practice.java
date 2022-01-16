package chap05;

import java.util.Scanner;

public class Array_practice {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;  //참조타입변수 scores 가 null 로 초기화되어있음 -> 배열 객체를 참조하고있지 않다. 항목에 대입x 읽는x
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());

            } else if (selectNo == 2) {
                scores = new int[studentNum];  //여기가 핵심이네.
                for (int i = 0; i < studentNum; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }

            } else if (selectNo == 3) {
                int j = 0;
                for (int dex : scores) {
                    System.out.println("scores[" + j + "]> " + dex);
                    j++;
                }

            } else if (selectNo == 4) {
                int max = 0;
                for (int i = 0; i < studentNum; i++) {
                    if (max <= scores[i]) {
                        max = scores[i];
                    }
                }
                int sum = 0;
                for (int i = 0; i < studentNum; i++) {
                    sum += scores[i];
                }
                double avg = (double) sum / studentNum;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);

            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
