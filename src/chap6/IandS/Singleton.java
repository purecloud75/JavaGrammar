package chap6.IandS;

public class Singleton {
    // 자신의 타입인 정적 필드(참조타입변수도 변수니까 가능이지)를 하나 선언하고 자신의 객체를 생성해 초기화함
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    static Singleton getInstance() {
        return singleton;
    }
}

/*
가끔 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야하는 경우가 있다. 이 때 이 싱글톤을 쓴다.
외부에서 객체를 얻는 유일한 방법은 getInstance() 메소드를 호출하는 방법입니다.
여러 개의 참조변수들을 만들어도 이들은 단 하나의 객체만을 공유한다.
 */