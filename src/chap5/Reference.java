package chap5;

public class Reference {
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";

        if (strVar1 == strVar2) {
            System.out.println("참조가 같음.");  //같은 String 객체를 공유함.
        } else {
            System.out.println("참조가 다름.");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("두 변수는 갖고있는 문자열이 같음");  //힙영역의 객체에 저장된 값이야 같지.
        }

        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");

        if (strVar3 == strVar4) {
            System.out.println("참조가 같음.");
        } else {
            System.out.println("참조가 다름.");  //new 연산자는 생성할때마다 별도로 힙영역에 객체를 생성하기에 참조가 다를수밖에.
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("두 변수는 갖고있는 문자열이 같음");  //힙영역의 객체에 저장된 값이야 같지.
        }


        String hobby = "travel";
        hobby = null;
        //이러면 travel 이라는 문자열값은 힙영역의 문자열객체에 저장되고, 스택영역에는 그 객체의 주소값이 저장되어 있는건데
        //참조타입변수에 null 을 할당하면, 그 객체를 참조안하겠다는 의미로 연을 끊는다. 그렇게 버려진 객체는 JVM 이 자동으로 제거시켜준다.
    }
}
/*
기본타입변수에 할당된 값은 스택영역 메모리에 저장됨.
참조타입변수에 할당된 값은 스택영역 메모리에는 주소값이 저장되고, 그 주소값은 힙영역 메모리에 실제 할당된 값이, 저장된 객체를 가리킴.
쉽게말해서 기본변수에는 값 자체가 저장되는 것이고, 참조변수에는 객체의 주소가 저장되는 것이다.
더 쉽게말해서 스택 영역에는 변수가 생성되고, 힙 영역에는 객체가 생성된다. 참조타입간의 ==, !=은 주소값(같은 객체를 참조하는지)를 비교.
참조타입변수란 String name = "hello"; 나 int[] scores = {10,20}; 처럼 클래스,배열 등을 말함. 자바에서는 배열도 객체이다.

참조타입변수는 힙영역의 객체를 참조하지 않겠다는 뜻으로 null 값을 가질수있음. null 은 스택영역 주소값저장공간에 저장됨.
int[] intArray = null;  String str1 = null;  이거 틀린거임. intArray 가 참조하는 배열 객체가 없기 때문이다.
intArray[0] = 10;       str1.length();                    str 변수가 참조하는 String 객체가 없기 때문이다.
널포인터예외 : 참조변수가 null 을 가지고있다면, 참조 객체가 없으므로 참조변수를 통해 객체를 사용할 수 없다. 그래서 위의 두 코드는 오류임.

String name1 = new String("John"); 에서 new 연산자는 힙영역에 새로운 객체를 만들 때 사용됨. 그래서 생성된 객체에 괄호안의 값을 저장!
 */