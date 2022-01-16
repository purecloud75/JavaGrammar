package chap08.Test4;

public class Test {
    public static void main(String[] args) {

        Queue library1 = new BookShelf();
        library1.enQueue("초등 1학년 수학");
        library1.enQueue("초등 2학년 수학");
        library1.enQueue("초등 3학년 수학");
        library1.enQueue("초등 4학년 수학");
        library1.enQueue("초등 5학년 수학");
        library1.enQueue("초등 6학년 수학");  //순차적으로 앞으로 들어감

        System.out.println(library1.getSize());

        System.out.println(library1.deQueue());
        System.out.println(library1.deQueue());
        System.out.println(library1.deQueue());
        System.out.println(library1.deQueue()); //순차적으로 앞에서부터 빠져나감 first in first out (FIFO) == Queue

        System.out.println(library1.getSize());
    }
}
