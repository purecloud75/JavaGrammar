package chap_10;

public class Throws {
    public static void main(String[] args){
        try {
            findClass();  //떠넘긴 메소드를 try{}안에서 호출함으로써 대신 예외처리를 해준다.
        } catch (NullPointerException e) {
            System.out.println("널포인터 예외");
        } catch (ClassCastException e) {
            System.out.println("타입변환 예외");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 초과 예외");
        }

    }

    //예외처리하고싶은 코드를 담고있는 메소드를, try{}안에서 호출하는 식으로 떠넘기면서 예외처리를 맡기는 모습이다.
    //main 메소드에서 예외처리를 최종처리 하는것이 좋다. throws 뒤에 적는 예외클래스들은 내가 이 코드가 이런 예외일 것같다 예상되는 것들을
    //적는것이지 실제 예외하고 옆에 적은게 안 맞는다고 문제는 안된다. 한마디로 내가 생각하는 에러뜨는 이유만 같이 보내주는거다. 틀려도 무방.
    public static void findClass() throws NullPointerException, ClassCastException{
        int[] arr = new int[] {5,7,8};
        int num1 = arr[6];
    }

}
