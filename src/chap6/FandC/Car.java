package chap6.FandC;

public class Car {
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed = 350;
    int speed;

    Car() {}  //디폴트 생성자로, 라이브러리 클래스에서 별도로 생성자함수를 만들지 않으면, 컴파일러가 자동으로 만들어주는 생성자.
    Car(String model) {
        this.model = model;
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
