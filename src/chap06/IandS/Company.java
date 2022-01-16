package chap06.IandS;

public class Company {
    // 자신의 타입인 정적 필드(참조타입변수도 변수니까 가능이지)를 하나 선언하고 자신의 객체를 생성해 초기화함
    // company 는 동일한 회사가 2개이상 존재할 수 없으니까 싱글톤의 대표적인 예이지. 단 하나의 객체(실제 회사)만 만들어야 할 때 쓴다.
    private static Company singleton = new Company();

    private Company() {
    }
    //이렇게 프라이빗한 디폴트생성자를 만들면, 객체 생성 시 생성자가 이미 있으니까 컴파일러가 자동으로 만들어주지않아.
    //거기다가 프라이빗하니 애초에 실행클래스에서 접근조차 못해. 즉 new 를 이용해서 쉽게 객체를 못 만든다.

    public static Company getInstance() {
        if (singleton == null) {
            singleton = new Company();
        }//방어적인 코드.
        return singleton;
    }
    //인스턴스 변수가 없는 메소드이므로 static 으로 정의한다.
}

/*
가끔 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야하는 경우가 있다. 이 때 이 싱글톤을 쓴다.
외부에서 객체를 얻는 유일한 방법은 getInstance() 메소드를 호출하는 방법입니다.
여러 개의 참조변수들을 만들어도 이들은 단 하나의 객체만을 공유한다.
실행클래스에서는 객체를 생성할 수 없으니 getInstance 에 접근불가. 그래서 static 으로 해줘야 클래스이름.메소드() 처럼 바로 접근 가능!
그리고 이 클래스의 유일한 객체인 singleton 참조변수가 static 이므로 공유가능!
 */