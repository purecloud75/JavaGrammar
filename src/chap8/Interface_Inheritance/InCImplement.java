package chap8.Interface_Inheritance;

public class InCImplement implements InC {

    @Override
    public void methodA() {
        System.out.println("InCImpl - methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InCImpl - methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InCImpl - methodC() 실행");
    }
}
