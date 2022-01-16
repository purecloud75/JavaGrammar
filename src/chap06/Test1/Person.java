package chap06.Test1;

public class Person {
    //field
    int height;
    int weight;
    String sex;
    String name;
    int age;

    //constructor
    Person() {}
    Person(int height, int weight, String sex, String name , int age) {
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    //method
    void printAll() {
        System.out.println("키가 "+height+"이고 몸무게가 "+weight+"킬로인 "+sex+"이 있습니다. 이름은 "+name+"이고 나이는"+age);
    }

}
