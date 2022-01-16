package chap05.Test2;

import java.util.ArrayList;

public class Student {

    private int num;
    private String name;
    ArrayList<Subject> subjectList;

    public Student(int num,String name) {
        this.num = num;
        this.name = name;
        subjectList = new ArrayList<>();
        //학생을 생성할 때마다 학생마다 1개의 과목리스트를 부여받는 것이다.
        //이 짓을 왜 하냐면, 학생마다 듣는 과목의 개수와 종류가 다 다른데 이를 위해 하나하나 다 선언해놓을 수가 없다. 유동적인 대처필요
    }

    public void addSubject(String sub,int score) {
        Subject subject = new Subject();
        subject.subjectName = sub;
        subject.score = score;
        subjectList.add(subject);
        //과목 추가할때마다 객체가 생성되고 매개값으로 초기화가 된 뒤, 순차적으로 pushback. 기차놀이 하듯이 붙는다. 다이내믹 배열인듯
        //즉 어떤 한 과목에 대한 정보들을 한곳에 모아서(subject 타입의 객체) 이를 같은 타입의 배열의 방에 시간순서대로 붙여 이어나간다.
    }

    public void showScoreInfo() {
        int total = 0;
        for (Subject one : subjectList) {
            total = total + one.score;
            System.out.println(name+" 학생의 "+one.subjectName+"점수는 "+one.score+"점 입니다.");
        }
        System.out.println("총 점은 "+total+"점 입니다.");
    }
}
