package chap07.Casting;

public class ChildExample {
    public static void main(String[] args) {

        Parent parent = new Child();
        //자식객체를 부모타입의 참조변수에 할당하는 모습.
        //마치 작은그릇에 꼭 맞았던 빵반죽이 큰 그릇으로 가면서 그거 어떻게든 다 채워보겠다고 막 억지로 늘리고 구멍 송송난 불쌍한 상태ㅠㅠ
        parent.field1 = "Data1";
        parent.method1();
        parent.method2();

        /*
        이 두개는 자식타입의 멤버들이라 불쌍한 빵반죽은 접근할 수가 없었어. 그래서 이 2줄은 컴파일 에러.
        parent.field2 = "Data2";
        parent.method3();
        억지로 늘려진 빵반죽에겐 부작용이 생겼어. 그건바로 큰 그릇에만 적응하라는 못된 제빵사때문에 원래의 작은그릇의 것들을 못쓰게 된거야ㅠㅠ
        */

        Child child = (Child) parent;
        //불쌍한 빵반죽이 다시 원래의 작은 그릇으로 돌아왔어! 이런 혜택은 앞서 고생을 한 친구들에게만 주어지는 거라 하더라고
        child.field2 = "Data2";
        child.method3();
        //이제 그 악독한 저주에서 풀려난 빵반죽은 다시 작은 그릇의 멤버들에게 환영을 받을 수 있었어. 끝!

    }
}
