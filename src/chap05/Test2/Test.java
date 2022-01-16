package chap05.Test2;

public class Test {
    public static void main(String[] args) {

        Student Jung = new Student(1001, "eunbi");

        Jung.addSubject("보컬", 99);
        //메소드명에 동사+목적어를 함께 표현하기도 하네.
        Jung.addSubject("댄스", 95);
        Jung.addSubject("짜냥함", 100);
        //정은비학생의 과목을 추가한다. 객체명은 "누가" 이고, 도트(.)은 "~의" 느낌이고, 함수명은 "~을 한다"는 의미로 쓰이네
        //이런 형식으로 함수를 짜고 클래스를 짜고 하는 것으로 보인다.

        Student Nam = new Student(1002, "yoondo");

        Nam.addSubject("물리", 89);
        Nam.addSubject("경영학", 97);
        Nam.addSubject("보컬", 100);

        Jung.showScoreInfo();
        Nam.showScoreInfo();
    }
}
