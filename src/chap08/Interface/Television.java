package chap08.Interface;

public class Television implements RemoteControl{

    private int volume;

    //인터페이스 RemoteControl 에 선언만 되어있는 추상 메소드들을 구현 클래스인 이곳에서 실체 메소드로서 정의를 해주고 있다. 안하면 오류!
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    //turnOff() 추상 메소드의 실체 메소드
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME; // 인터페이스는 객체를 생성할 수 없는 아이라서, 직접 접근이 가능함.
        } else if (volume < MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
