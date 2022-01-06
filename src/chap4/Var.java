package chap4;

public class Var {
    public static void main(String[] args) {
        
        var num1 = 10;
        
        var num2 = 3.141592;
        
        var str = "hello";

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
        
        str = "change suc";

        System.out.println(str);
        
        //str = 10;
    }
}

/*
할당받는 데이터의 타입에 따라 변수의 메모리의 크기를 결정하는 자료형이 자등으로 맞춰진다.
하지만 한번 정해지면 그대로 유지해야하므로 라인 20은 오류
 */
