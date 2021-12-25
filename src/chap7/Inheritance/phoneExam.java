package chap7.Inheritance;

public class phoneExam {
    public static void main(String[] args) {

        Dmb phone = new Dmb("Galaxy note10", "White", 20);

        System.out.println("모델:"+phone.model);
        System.out.println("색상:"+phone.color);  

        System.out.println("채널:"+phone.channel);
        
        phone.powerOn();
        phone.bell();
        phone.sendVoice("여보세요?");
        phone.receiveVoice("어 나야 밥이나 먹자");
        //이상 부모클래스인 cellPhone 클래스로부터 상속받은 메소드
        
        phone.turnOnDmb();
        phone.changeChannelDmb(5);
        phone.turnOffDmb();
        //이상 자식클래스(객체 phone 의 클래스)의 메소드
        //결국 Dmb 클래스의 객체에 접근하는 것인데 다만 상속받는 클래스가 따로 있을 뿐이고 여기서는 웬만하면 둘 다 쓸 수 있고!
        
        phone.powerOff();
    }
}
