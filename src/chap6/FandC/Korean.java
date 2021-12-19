package chap6.FandC;

public class Korean {
    String nation = "대한민국";  // 수십명의 사람객체들의 공통점은 애초에 클래스에서부터 필드를 초기화해주고 나머지는 생성자함수를 통해서!
    String name;
    String ssn;

    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }//필드와 생성자함수의 매개변수를 동일한 이름으로해야 코드가독성 up. but 그렇게하면 오류남. 그래서 필드앞에 this. 를 붙여준다.
}
