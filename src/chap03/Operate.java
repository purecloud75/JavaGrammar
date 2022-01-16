package chap03;

public class Operate {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println(x);

        y--;
        --y;
        System.out.println(y);

        z = x++;
        System.out.println(z);  // 12
        System.out.println(x);  // 13

        z = ++x;
        System.out.println(z);  // 14
        System.out.println(x);  // 14

        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);

        double v4 = 0.1;
        float v5 = 0.1F;
        System.out.println(v4 == v5);
        System.out.println((float) v4 == v5); //0.1f는 사실 0.100000001432...로 아주약간 더 크다. 그래서 강제타입변환함.

        int result = 10;
        result -= 3;  // 오른쪽을 -를해서 왼쪽에 다시 할당한다. result = result - 3; 즉 7이 할당되어있겠지
        result %= 2;
        System.out.println(result);

        int score = 85;
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println(grade); //만약 저 grade의 타입이 int 였다? 그러면 출력은 66으로 되는거임.

        String str3 = "JDK" + 3 + 3.0;  // JDK33.0
        String str4 = 3 + 3.0 + "JDK";  // 6.0JDK 어쨌거나 둘 다 결과는 문자열 string타입이라고 할수있다.
        System.out.println(str3);
        System.out.println(str4);
    }
}

/*부호도 연산자야. 그래서 byte num1 = 10;  byte num2 = -num1; 하면 틀린거야 num2는 int형이여야지.
++연산자는 피연산자의 값에 1을 더해서 그 결과를 다시 피연산자에 저장한다. ++i처럼 앞에있어야 우선적으로 1을 더해준다.
 */