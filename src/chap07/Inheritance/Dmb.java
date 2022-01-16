package chap07.Inheritance;

public class Dmb extends cellPhone {

    int channel;

    Dmb(String model, String color, int channel) {
        //자식 객체를 생성하면, 부모 객체가 먼저 생성되고 그다음에 자식 객체가 생성된다. 모든 객체는 클래스의 생성자를 호출해야만 생성된다.
        //super()은 부모클래스의 생성자를 호출한다. 자식클래스의 생성자 첫 줄에서만 허용. 부모클래스에 생성자가 없다면
        //컴파일러가 알아서 부모클래스의 디폴트생성자를 만들어서 부모 객체를 생성한다. 자식클래스 생성자 안에 super(); 가 자동 생성된거지.
        //부모클래스에 디폴트생성자는 너가 만들어. 확실하게 가자.
        super(model);
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("채널: " + channel + "번 을 보여드립니다.");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널: " + channel + "번 으로 바꿉니다.");
    }

    void turnOffDmb() {
        System.out.println("DMB 방송을 종료합니다.");
    }
}
