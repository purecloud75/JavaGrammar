package chap8.Test3;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("buy order");
    }
}
