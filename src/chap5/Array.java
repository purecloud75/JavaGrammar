package chap5;

public class Array {
    public static void main(String[] args) {  // 문자열타입의 배열변수를 매개변수로 받는 main 메소드이다.
        int[] scores;
        scores = new int[]{83, 90, 87};
        //int 타입의 배열 객체를 힙 영영에 생성하여, 그 주소값을 스택 영역에 생성된 배열 변수에 리턴해주겠다는 의미.
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총 합 : " + sum1);

        int sum2 = add(new int[]{83, 90, 87}); //add 함수의 매개변수로 new 로 생성한 배열을 할당한 상태. 리턴값 sum 을 호출함.
        System.out.println("총 합 : " + sum2);


        double[] arr1 = new double[3]; //3은 배열의 길이로, 매열이 저장할 수 있는 값을 개수를 의미.
        arr1[0] = 83;
        arr1[1] = 90;
        arr1[2] = 87;
        int size = arr1.length;  //배열 객체의 length 필드를 읽는다. 필드는 객체 내부의 데이터를 의미.
        System.out.println("길이 : " + size);

    }

    public static int add(int[] anything) {  //int 타입의 이 함수의 로컬 배열변수인 anything 에, scores 가 복사된 것이다.
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += anything[i];
        }
        return sum;
    }
}

/*
배열은 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스를 부여해놓은 자료구조입니다.
String[] names = {"John","James","Anna"};
중괄호 {}는 주어진 값들을 항목으로 가지는 배열 객체를 힙에 생성하고, 배열 객체의 주소를 리턴한다.
배열 변수는 리턴된 주소를 저장함으로써 참조가 이루어집니다.
new 는 객체생성 연산자이다.  배열을 만들고싶다면 맘 편하게 new 를 이용하자.
배열의 마지막 인덱스는 배열 길이보다 1이 적다. 0부터 시작하니까.
 */

