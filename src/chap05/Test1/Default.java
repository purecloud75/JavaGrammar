package chap05.Test1;

public class Default {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch++;  //대입하고나서 1을 더하는 후행연산자
        }

        for (char alpha : alphabets) { //배열의 처음부터 끝까지 한번 순회하는 반복문. 각 요소를 왼쪽 같은타입의 변수에 할당하고 사용
            System.out.println(alpha + ", " + (int) alpha);
        }
    }
}
