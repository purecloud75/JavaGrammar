package chap6.IandS;

public class Person {

    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    static final double EARTH_RADIUS = 6400;
    static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}

/*
final 필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없다.
초기화 방법은 필드 선언시에 주거나, 생성자에서 주는 방법 2개뿐이다.
static 은 공용데이터의 경우에 쓰는거지만 사실 수정은 가능하다. static double pi = 3.14; 라 했지만 사실 저 값은 변경 가능하다.
final 필드는 한 번 초기화되면 수정할 수 없는 필드이지만, 객체마다 저장되고 생성자의 매개값을 통해서 여러 가지 값을 가질수 있기에 상수는 아니다
진정한 상수는 바로 static final 이다. 지구의 중력가속도 또는 원주율처럼 "불변의 값" 을 데이터로 쓰고자 할 때 상수를 쓴다..

정리 : static final 필드는 객체마다 존재하지 않고 클래스에만 존재함. 그리고 한 번 초기값이 저장되면 변경할 수 없음. 오직 클래스안에서만 선언
 */