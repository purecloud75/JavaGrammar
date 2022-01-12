package chap6.Test2;

public class Student {

    String studentName;
    int studentId;

    Subject korea;
    Subject math;

    Student(String name, int id) {
        this.studentName = name;
        this.studentId = id;
        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.subjectScore = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.subjectScore = score;
    }

    public void show() {
        int total = korea.subjectScore + math.subjectScore;
        System.out.println(studentName + "학생의 총 점은 " + total + "점 입니다.");
    }

}
