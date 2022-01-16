package chap1;

import java.util.Scanner;  //문자열 입력받고자 스캐너 쓸때 이 라인 까먹지말고 꼭 집어넣어!

public class IO {
    public static void main(String[] args) throws Exception {

        /*int keyCode;
        while(true)
        {
            keyCode = System.in.read(); //얘는 문자하나를 입력받음. 다만 keyCode가 int형이므로 유니코드가 입력됨. "10" = \n
            System.out.println("keyCode: " + keyCode);  // 숫자123입력하면 49, 50, 51, 10이 출력된다. 문자 "1" = 49
            if (keyCode == 113){
                break;
            }
        }*/


        /*String name = "김자바";
        int age = 25;
        String tel1 = "010", tel2 = "123", tel3 = "4567";
        System.out.println("이름: " + name);  //ln은 line의 줄임말로, 다음행으로 넘겨주는 친절한 친구임.
        System.out.print("나이: " + age + "\n");
        System.out.printf("전화: %s-%s-%s", tel1, tel2, tel3);*/


        Scanner cookie = new Scanner(System.in);  //얘는 문자열을 입력받음.
        //scanner타입의 변수에다가 새로운 스캐너(문자열 입력받을수있는아이)를 생성해서 할당해.
        String inputData;

        while (true) {
            inputData = cookie.nextLine();  //스캐너를 할당받은 객체를 통해, 스캐너가 키보드로부터 받아들여온 문자열을 할당할거야.
            //실질적인 입력은 nextLine()을 통해 받는거야. 그러니까 여러번 입력이 가능하지.
            System.out.println("\"" + inputData + "\"");

            if (inputData.equals("q")) {  // 문자열 inputData와 문자열 q를 비교
                break;
            }
        }
        System.out.println("종료");
    }
}