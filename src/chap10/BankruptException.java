package chap10;

public class BankruptException extends Exception{

    public BankruptException() {}

    public BankruptException(String message) {
        super(message);
    }
    //사용자정의예외클래스(내 입맛대로 직접만든 예외클래스)에서 상위클래스인 Exception 클래스의 생성자를, 문자열매개값을 주면서 호출한다.
    //그러면 Exception 의 임의의 한 필드에 그 문자열이 할당되었을 것이고, 그것을 Exception 의 getMessage()를 통해 반환받을 것이다.
}
