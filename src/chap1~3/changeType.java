public class changeType {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue; //작은타입에서 큰 타입으로 그 변수값을 할당하면 자동 타입변환이 된다.
        System.out.println(intValue);

        char charValue = '가';  //유니코드형태(정수)로 할당된다.
        intValue = charValue;
        System.out.println(intValue);

        long longValue = 100;
        float floatValue = longValue;
        System.out.println(floatValue);  //실수형은 정수형보다 무조건 크다. 셋 다 자동형변환!

        int var1 = 44032;
        char var2 = (char) var1;  //큰 타입을 작은타입의 변수에 값을 할당할때, 작은타입 = (작은타입)큰타입 꼴. 강제 타입변환.
        System.out.println(var2); // 가

        double var3 = 3.14;
        var1 = (int) var3;
        System.out.println(var1); // 3

        byte x = 10;
        byte y = 20;
        int result = x + y; //그러므로 이 result가 byte이면 안되겠지...
        System.out.println(result); //정수어떤타입이던 연산수행결과는 항상 int형으로 자동변환된다. 단 long이있으면 long으로 변환.

        int intvar1 = 10;
        int intvar2 = intvar1 / 4;
        System.out.println(intvar2);

        int intvar3 = 10;
        double intvar4 = intvar3 / 4.0;  //리터럴F가 붙지않았다면 double형. 연산자 좌우에 하나라도 double이있으면 그 결과는 더블
        //왜냐하면 하나라도 double형이면 그 밖의 정수든 뭐든 다 double형으로 자동변환이 되어서 연산결과도 double타입이 된다.
        System.out.println(intvar4); // 2.5

        int a = 1;
        int b = 2;
        double c = a / (double) b; // 0.5
        System.out.println(c);

        String str1 = 3 + 7 + "5";
        System.out.println(str1);  // 105. 3과 7이 덧셈이되어 10이되고, 그 10이 "5"와 만나서 10이 문자열로써 변환됨.
        //그래서 두 문자열끼리의 붙이는 연산을 통해 "10" + "5"가 되어서 결론은 105가 된다.

        //마지막으로 문자열을 기본타입으로 강제 타입변환 시키는 경우
        String str2 = "75";
        int abc = Integer.parseInt(str2);

        String str3 = "3.141592";
        double abd = Double.parseDouble(str3);

        String str4 = "false";
        boolean abe = Boolean.parseBoolean(str4);
        System.out.println(str4);

        String str5 = String.valueOf(abd);  //반대로 숫자를 문자열로 바꿔준다.
        System.out.println(str5);
    }
}

/*

 */