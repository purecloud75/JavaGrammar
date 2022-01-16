package chap06.FandC;

public class Car2 {

    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    Car2() {}
    Car2(String model) {
        //실행 클래스에서 이 생성자를 호출해도, 얘(바로 옆 생성자)는 다시 저 주황빛 반짝이는 생성자를 호출해서 필드를 초기화한 후에
        //다시 원래 생성자인 여기로 돌아와서 this()이후에 만약 있다면 중괄호{}안의 실행문을 진행한다.
        this(model, "은색", 250);
    }
    Car2(String model, String color) {
        this(model, color,250);
    }
    Car2(String model,String color,int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

/*
생성자 오버로딩이 많아질 경우 생성자 간의 중복된 코드가 발생할 수 있다. 이 경우에는 필드 초기화 내용을 한 생성자에만 집중적으로 작성하고
나머지 생성자들은, 초기화 내용을 가지고 있는 생성자를 호출하는 방법으로 개선할 수 있다.
this() 는 자신의 다른 생성자를 호출하는 코드로 반드시 생성자의 첫 줄에서만 허용된다. 매개변수 타입과 개수 즉, 시그니처에 맞게 써주자.
 */