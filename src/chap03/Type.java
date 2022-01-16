package chap03;

public class Type {
    public static void main(String[] args) {
        int var1 = 0b1011;  //2진수앞에 0b를 붙이면 이 값이 10진수값, 즉 우리가 아는 정수값으로 바뀌어짐. 굳굳
        int var2 = 0206;  //8진수앞에 0. 2곱하기 8의2승 + 0곱하기 8의1승 + 6곱하기 8의0승 = 134 이런식이다.
        int var3 = 365;  //그냥
        int var4 = 0xb3;  //16진수앞에 0x -> 10진수
        byte var5 = 127;
        long balance = 3000000000L; //long type변수에 int의 범위를 넘어선 값을 할당시에는 리터럴L을 붙여야한다. 컴파일러 안놀라게
        char var6 = 'A';
        char var6_1 = 65;
        int var7 = 'A';
        int var7_1 = 65;
        String name = "Java";  //대문자 S임에 주의.
        String str = "나\\는 \"자바\"를 좋아\n합니다\t.";  //문자열 내에 \가 붙은 문자사용 가능. 이스케이프문자.
        //얘를 쓰면 문자열 내부에 특정 문자를 포함할 수 있다. 단 \" 처럼 몇 가지 없다. 아무문자나 다 삽입 안된다.
        float var8 = 3.14F;
        double var9 = 3.15; // float보다 소수점을 더 많이표시해줌. 정밀도가 7 -> 15로 상당히 높다.
        float var10 = 3E6F; // 3곱하기 10의6승인데 float형이므로 값 뒤에 리터럴F를 붙인모습이다.E와6사이에 +가 생략된모습
        boolean var11 = true;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var6); // A. char 타입변수에 문자리터럴을 할당시, 그대로 나옴. 변수에 저장은 유니코드값이 저장되는것.
        System.out.println(var6_1);  // A.
        System.out.println(var7); // 65. 그 외의 타입변수에 문자리터럴을 할당시, 그 문자의 해당 유니코드값 65가 나온다.
        System.out.println(var7_1);  // 65.
        System.out.println(name);
        System.out.println(str);
        System.out.println(var10);  // 3000000.0
        System.out.println(var11);  // true
    }
}

/*
byte -128~127, short는 동일, char는 unsigned short임, int는 동일, long은 long long임. 각각 1,2,2,4,8바이트의 메모리를 차지
float는 4바이트, double은 8바이트이다.
자바는 실수리터럴을 기본적으로 double 타입으로 해석하기에 double 타입변수에 저정해야하고, 만약 float타입변수에 저장하고싶다면
저장할 실수값뒤에 리터럴F를 붙여야 한다. 이는 정수리터럴을 기본적으로 int 타입으로 해석하는 경우도 마찬가지이다. long쓸때 리터럴L 붙여
3e-5나 3e6이나 e라는 친구는 실수형변수에서만 쓰일수있다.
 */