package chap10;

public class Account {

    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    //메소드 뒤에 예외클래스를 떠넘기는 코드를 작성하면, 이 메소드를 호출한 곳에서 반드시 예외처리(try-catch)를 해야하고 try{}안에서만 호출
    //조건문이 참이면 직접만든예외클래스타입의 예외객체를 예외메시지를 주면서 생성하고 try문을 종료, 바로 매개변수타입에 맞는 catch문에 간다.
    public void withdraw(int money) throws BankruptException {
        if (balance < money) {
            throw new BankruptException("잔고부족:" + (money - balance) + "원 부족");
        }
        balance -= money;
    }
}
