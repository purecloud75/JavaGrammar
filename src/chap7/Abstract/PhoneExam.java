package chap7.Abstract;

class PhoneExam {
    public static void main(String[] args) {

        //Phone phone = new Phone(); 추상클래스타입의 객체는 못 만든다. 추상클래스타입의 생성자는 호출 못한다. 자식생성자에서 super()!

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
