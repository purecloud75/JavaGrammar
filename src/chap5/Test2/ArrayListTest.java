package chap5.Test2;

import java.util.ArrayList;
import chap5.Test1.Book;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();  //기본 배열크기는 10이다. 기존 배열에 비해 장점이 많은 배열클래스이다.

        library.add(new Book("태백산맥1","조정래"));
        library.add(new Book("태백산맥2","조정래"));
        library.add(new Book("태백산맥3","조정래"));
        library.add(new Book("태백산맥4","조정래"));
        library.add(new Book("태백산맥5","조정래"));

        for (int i = 0; i < library.size(); i++) {  //요소의 개수를 지정하므로 5이다
            library.get(i).showInfo();
        }
    }
}
