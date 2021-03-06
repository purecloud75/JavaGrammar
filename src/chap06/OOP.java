package chap06;

public class OOP {
    public static void main(String[] args) {
        char charValue = '가';  //유니코드형태(정수)로 할당된다.
        int intValue = charValue;
        System.out.println(intValue);


        int result = 10;
        result -= 3;  // 오른쪽을 -를해서 왼쪽에 다시 할당한다. result = result - 3; 즉 7이 할당되어있겠지
        result %= 2;
        System.out.println(result);
    }
}
/*
객체는 속성(필드)과 동작(메소드)로 구성되어있다. 사람은 이름,나이와 걷다,웃다 로 이루어져있다. 필드 = 멤버변수, 메소드 = 멤버함수.
객체가 부품이고 여러 부품들간의 상호작용으로 하나의 완성품이 나오는데, 이 완성품을 프로그램 이라고 한다.
객체들 사이의 상호작용 수단은 메소드 호출! 매개값과 리턴값을 통해 데이터를 주고받는다.
객체는 설계도(클래스)를 바탕으로 만들어진다. 클래스로부터 만들어진 객체를 해당 클래스의 인스턴스 라고 한다. 동일한 설계도로 여러 객체 생성가능.
가급적이면 소스파일 하나당 동일한 이름의 클래스 하나를 선언하는 것이 좋습니다.
배열과 마찬가지로, new 연산자로 객체를 생성하고 리턴된 객체의 주소를 클래스 변수에 저장하면 그 변수가 객체를 참조하게 된다. 객체는 힙에!

다시말해서 new 연산자에 의해 생성자가 성공적으로 실행되면 힙 영역에 객체가 생성되고 객체의 주소가 리턴되는데, 이는 클래스 변수에 저장된다.
생성자는 리턴타입이 없고 클래스이름과 동일하다.

클래스가 100개라면 99개는 라이브러리 클래스(필드,생성자,메소드(객체가 가져가야할 구성 멤버))이고 단 하나가 실행 클래스(main)이다.
도트(.) 연산자는 객체접근 연산자로 객체가 가지고 있는 필드나 메소드를 사용하고자 할 때 사용된다.

객체를 정의하고 그 객체의 속성과 역할이 뭐가 있을 지 생각하는 연습을 하자. 매개변수도 지역변수에 포함된다.
Car myCar = new Car()에서 Car()은 생성자이다. 생성자는 객체생성에 무조건 필수고, 다만 생성과 동시에 초깃값을 넣어주고싶다면
분명 코드진행하다보면 데이터가 수정될 여지가 있더라도 일단 초기값을 지정하고싶다면 생성자() 괄호안에 넣어준다. 따로 만들어야지
마치 메이플에서 캐릭생성할 때 머리 눈동자 옷 등을 최초로 아무거나 골라서 생성한 뒤에, 인게임에서 바꾸는 식으로 하는 거다.
생성자로 초기값만 설정하면서 객체를 생성하고, 그 객체의 필드값을 코드 중간에 setter()를 통해 수정한다!!

컴파일러에 의한 디폴트생성자가 생긴다면 얘는 해당 클래스의 접근지정자를 따라가고, 그게아니라면 보통은 실행클래스에서 써야하니까
생성자 앞에 public 을 붙여준다. 다른 패키지의 실행클래스에서 해당 클래스의 객체를 생성해서 쓸 수도 있으니까.
라이브러리클래스에 매개변수받는 생성자만 정의하고, 실행클래스에서는 디폴트생성자로 객체를 만들 시에, 오류발생. 라이브러리 클래스에
정의된 생성자가 하나도 없을때에멘 컴파일러가 자동으로 디폴트생성자를 만들어주기때문에 이 경우에는 직접 디폴트생성자를 만들어줘야 오류 안생긴다

this 는 인스턴스가 자체적으로 갖고있는, 객체 자신의 주소값이 들어있는 아이이다. 생성자에서 다른 생성자를 호출시에도 쓰인다.
 */