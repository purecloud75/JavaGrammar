package chap5.Test1;

public class Test {
    public static void main(String[] args) {

        Book[] library = new Book[5]; //마치 참조타입변수들의 집합같다
        Book[] copy = new Book[5];
        //5개의 방이 일렬로 있는건데, 각 방은 Book 클래스타입의 객체의 주소값이 저장되어 있는것이고, 그 객체를 참조할 뿐이다.
        //현재 여기까지는 그 어느방도 객체를 참조하고 있지않아서 NULL 이 들어가 있는 중이다. 같은 Book 타입의 객체의 주소만 할당 가능한거임

        library[0] = new Book("파우스트", "괴테");
        library[1] = new Book("혼공자바", "신용태");
        library[2] = new Book("메이플", "스토리");
        library[3] = new Book("메이플2", "스토리2");
        library[4] = new Book("메이플3", "스토리3");

        System.arraycopy(library, 0, copy, 0, library.length);
        //얕은 복사라고해서 주소값만 새 배열에 복사해온다. 즉 각 배열의 같은 인덱스의 방은, 같은 객체를 참조하므로 같은 주소값이 들어있다.

        /*
        copy[0] = new Book();
        copy[1] = new Book();
        copy[2] = new Book();
        copy[3] = new Book();
        copy[4] = new Book();

        for (int i = 0; i < copy.length; i++) {
            copy[i].setTitle(library[i].getTitle());
            copy[i].setAuthor(library[i].getAuthor());
        }*/
        //깊은 복사. 카피하고자 하는 배열의 각 요소마다 Book 클래스타입의 객체를 할당하고, 그 객체의 필드값만 기존 것으로 직접 넣어준다.

        library[0].setTitle("바뀐제목");
        library[0].setAuthor("바뀐저자");
                        
        for (Book book : library) {
            System.out.println(book);  //해당 인덱스를 갖는 방이 갖고있는 객체의 주소값이 나올것이다.
            book.showInfo();
        }

        for (Book cpbook : copy) {
            System.out.println(cpbook);  //해당 인덱스를 갖는 방이 갖고있는 객체의 주소값이 나올것이다.
            cpbook.showInfo();
        }
    }
}