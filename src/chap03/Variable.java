package chap03;

public class Variable {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2;
            v2 = v1 - 10;
        }
        //int v3 = v1 + v2 + 5;  //v2는 if문 나오면서 사라진거임. 그래서 이 라인이 오류임. 없는변수를 어떻게 더하겠어
    }
}

/*
변수는 값을 저장할 수 있는 메모리의 특정 번지에 붙이는 이름
println(a, b)틀린거야. 오류난다. println(a + ", " + b);처럼 두 변수 사이를 +로 연결해주어야하고, 우리는 a+b말고
a와 b 각각을 출력해보고싶으니까 컴마를 문자열취급해서 이렇게 써주자. 그러면 출력에 3, 5 이렇게 잘 나온다;;
변수는 자신이 선언된 위치로부터 자신이 속한 블록 내부(중괄호{}안)에서만 사용할 수 있다.
*/