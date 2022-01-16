package chap08.Casting;

public class VehicleExam {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus();
        //구현객체가 인터페이스변수에 할당되는것을 말하는 자동타입변환이 바로 이것이다.

        vehicle.run();
        //vehicle.checkFare(); 해당 인터페이스에는 run()만 선언되있어서 접근 불가능

        //인터페이스타입변수가 할당받은 객체가 Bus 객체여서 자동타입변환이 된 경우에만 이처럼 if 조건문이 참이되고 실행을 오류없이 할수있다.
        if(vehicle instanceof Bus) { //들어있는 주소값이 가리키는 객체의 타입을 기준으로. 자식객체 and 구현객체
            Bus bus = (Bus) vehicle;
        //인터페이스에 할당된 구현객체를 원래의 구현클래스타입으로 강제타입변환(Casting)을 해준다. 상속에서의 그것과 거의 똑같다.

        bus.run();
        bus.checkFare();
        //단순 Bus 클래스의 객체이므로 당연히 접근가능하다. private 만 아니라면 말이다.
        }
    }
}
