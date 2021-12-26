package chap7.Casting;

public class Parent {

    public String field1;

    public void method1() {
        System.out.println("Parent-method1()");
    }
    public void method2() {
        System.out.println("Parent-method2()");
    }
}
/*
강제타입변환은 부모타입을 자식타입으로 변환하는 것을 말하는데, 단 자식타입이 부모타입으로 자동타입변환한 후에 "원상복구" 할때에만 가능한 기능.
자식타입이 부모타입으로 자동타입변환하면 부모에 선언된 필드와 메소드만 사용 가능하다는 제약 사항이 따른다.
만약 자식의 멤버를 꼭 써야한다면 강제타입변환을 해서 다시 자식타입으로 변환한 다음에 자식의 멤버(필드, 메소드) 를 사용하면 된다.

강제타입변환이 가능한 전제조건때문에 이를 만족 못할시 컴파일 오류가 셍기는데
부모변수가 참조하는 객체가 과연 부모객체인지 자식객체인지 코드가 막 복잡해서 몰라서 확인하는 방법이 있다.

public void method(Parent parent) {   parent 가 부모객체인지 자식객체인지 헷갈릴때 쓰는 요긴한 방법이다. 객체 인스턴스오브 타입 꼴!
    if(parent instanceof Child) {
        Child child = (Child) parent;
 */