package chap5;

import java.util.Scanner;

public class copyArray {
    public static void main(String[] args) {
        int[] oldArray = {1, 2, 3};
        int[] newArray = new int[5];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
        // 1, 2, 3, 0, 0, 복사되지 않은 항목은 int[] 배열의 기본 초기값 0이 그대로 유지됩니다.
        System.out.print("\n");


        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
        // java, array, copy, null, null,
        System.out.print("\n");


        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
        //배열 전용 for 문. 배열에서 가져올 값이 존재하면 그 값을 왼쪽변수에 할당 후 실행문 수행. 다시 배열변수로 돌아와 반복 후
        //더이상 가져올 값이 없으면, 즉 마지막 인덱스의 값 가져오고 그 다음차례가 되면 for 문 나온다. 반복횟수 = 배열의 항목 수 = 길이


        int[] numArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numArray.length; i++) {
            /*numArray[i] = Integer.parseInt(scanner.nextLine());*/  //scanner.nextLine()은 엔터치기 직전까지의 문자열을 받음.
            numArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + ", ");
        }
    }
}
