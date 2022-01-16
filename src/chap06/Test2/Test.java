package chap06.Test2;

public class Test {
    public static void main(String[] args) {

        Student kim = new Student("김성철",20200532);
        kim.setKoreaSubject("국어",90);
        kim.setMathSubject("수학",88);

        Student Lee = new Student("이생강",20180532);
        Lee.setKoreaSubject("국어",75);
        Lee.setMathSubject("수학",96);

        kim.show();
        Lee.show();
    }

}
