package chap08.Interface;

public interface RemoteControl {

    //상수 필드. public static final 이 컴파일을 거치면 자동으로 붙기에 생략가능하다. 상수는 선언과 동시에 꼭 초기화를 해줘야한다.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드. public abstract 가 컴파일을 거치면 자동으로 붙기에 생략가능하다.
    //이렇게 상수 필드와 추상 메소드만이 인터페이스에 존재 가능하다.
    //메소드의 선언부(한 줄짜리)만 적고, 이에 대한 implementation 은 이 인터페이스를 구현하는 클래스에서 반드시 해야만 한다.
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

/*
인터페이스는 객체로 생성할 수 없기 때문에 생성자를 가질 수 없고, 따라서 인터페이스 내에는 실행문을 갖는 메소드나 생성자, 보통의 필드가 못 온다.

인터페이스의 모든 메소드는 기본적으로 public 접근 제한을 갖기 때문에, 실체 메소드를 정의(또는 구현)할 때
public 을 안 적거나(default 처리) private, protected 등으로 써 주면 컴파일 오류가 난다.

인터페이스는 개발코드와 구현객체 사이에서 접점 역할을 담당한다. 인터페이스 내에는 내용이 없어요.
그 내용은 해당 인터페이스를 구현하는 구현 클래스에 있고, 그 내용을 담고있는 실체화된 아이인 구현 객체가
해당 인터페이스타입의 참조타입변수에 주소값을 넘기는 식으로 할당이 되면서, 그 인터페이스타입 변수를 통해 객체의 메소드에 직접 접근한다.

개발 코드는 인터페이스에 선언된 추상 메소드를 호출하고, 인터페이스는 구현 객체의 재정의된(= 구현된) 메소드를 호출합니다.
개발코드(클라이언트)에서는 인터페이스만 보고 판단하고 사용합니다. 그걸 구현한 구현클래스들(서버)는 관심 없습니다!! 일종의 객체사용설명서?
 */