package chap7.Override;

public class SuperSonicAirPlane extends AirPlane {

    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override  //메소드가 정확히 재정의된 것인지 컴파일러가 확인하기 때문에 개발자의 실수를 줄여준다. 이름이나 시그니처 틀리면
    //메소드 2개인데 난 재정의 하고하싶었거든. 컴파일러가 나의 의도대로 해석 안 할수도 있는 여지를 예방한다. 위의 2개 틀리면 컴파일에러!
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();  //메소드 재정의에 의해 숨겨진 부모클래스의 원래 메소드를 호출한다. super 는 부모객체를 참조하고 있는 친구이다.
        }
    }
}
