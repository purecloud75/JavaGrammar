package chap08.Test2;

public class Test {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();
        //Calc calc = new CompleteCalc();
        //형 변환된 경우 인터페이스에 선언된 메소드만을 사용가능함.
        //이것도 맞음, 난 오히려 이게 더 맞는거같은데 왜 위에처럼 자식클래스 타입변수에 할당하지?
        //Calc calc 가 정석인건 확인함. 다만 타입상속이라고해서 저 CompleteCalc 가 Calc 타입을 뭐 어떻게 이용해서 저것도 가능한 듯...
        //CompleteCalc calc 를 하면, CompleteCalc 클래스에 정의된 showInfo()까지도 추가로 접근이 가능하다. 이 차이구나.
        //자식객체를 자식타입변수에 넣으면 부모자식멤버 모두접근가능 but,자식객체를 부모타입변수에 넣으면 부모멤버에만 접근가능. 여기서 착안!

        System.out.println(calc.add(num1, num2));
        System.out.println(calc.sub(num1, num2));
        System.out.println(calc.mul(num1, num2));
        System.out.println(calc.div(num1, num2));

        calc.description();
        //인터페이스 description 에 들어있는 myMethod()는 재정의된 메소드때문에 실행이 안된것이다. 원래는 잘 출력이 된다.

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int result = Calc.total(arr);
        System.out.println(result);
    }
}
