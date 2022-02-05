package chap10;

public class AccountExam {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액:" + account.getBalance());

        try {
            account.withdraw(30000);
            System.out.println("과연 나는 실행될까? 안될것이다.");
        } catch (BankruptException e) {
            String message = e.getMessage();  //자식객체는 부모타입의 메소드에 접근가능하니까. private 만 아니라면!
            System.out.println(message);
            e.printStackTrace();  //예외가 발생된 경로를 보여줘서 위치파악에 용이
        } catch (Exception e) {
            System.out.println("마찬가지로 실행안된다. catch 문은 하나만 실행되고 바로 finally 문으로 간다.");
        }

    }
}
