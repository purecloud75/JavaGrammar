package chap7.Abstract2;

public class AnimalExam {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();

        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();

        animalSound(new Dog());
        animalSound(new Cat());

    }
    public static void animalSound(Animal animal) {
        animal.sound();  //자식객체가 매개값으로 들어오고 부모타입으로 자동변환되고, 부모타입것만 접근가능하지만 오버라이딩이라 자식메소드!
    }
}
