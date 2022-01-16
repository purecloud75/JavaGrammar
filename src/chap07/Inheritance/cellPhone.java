package chap07.Inheritance;

public class cellPhone {

    String model;
    String color;

    cellPhone() {}
    cellPhone(String model) {
        this.model = model;
    }

    void powerOn() {
        System.out.println("전원 켜주세요");
    }

    void powerOff() {
        System.out.println("전원 꺼주세요");
    }

    void bell() {
        System.out.println("띠리링 띠리링");
    }

    void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
