package chap8.Polymorphism;

public class HanKookTire implements Tire {

    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}
