package chap08.Interface;

// 다중 인터페이스의 경우, 모든 추상 메소드들을 다 정의해야
public class SmartTelevision implements RemoteControl, Searchable {

    private int volume;

    @Override
    public void search(String url) {
        System.out.println(url + "를 검색합니다.");
        System.out.println(MAX_VOLUME); //인터페이스2에서 선언된 메소드도 인터페이스1에 선언된 상수에 접근이 가능하다. 만남의 광장인가
    }

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
