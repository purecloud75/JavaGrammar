package chap06.PandL;

public class accessLevel {

}

/*
public : 외부 클래스가 자유롭게 사용할 수 있도록
protected : 같은 패키지 혹은 자식 클래스(외부에 있어도 인정)에서 사용할 수 있도록
default : 말 그대로 별도의 접근지정자를 설정하지 않으면 선택되는 옵션으로, 같은 패키지에만 사용할 수 있도록
private : 오로지 해당 클래스(단 하나의 클래스)에서만 사용할 수 있도록

클래스 / 생성자 / 필드 / 메소드 총 4가지에 접근지정자 부여 가능
클래스는 public 과 default 2개 뿐이다. 단 default 는 아무것도 입력 안한 상태를 의미하므로 저 키워드가 따로 있는게 아님. 퍼블릭과 빈 칸 뿐
단 생성자가 없어서 디폴트생성자를 쓰는 경우, 이 생성자는 클래스의 접근지정자를 따른다. public class 이면 알아서 className()도 public
 */