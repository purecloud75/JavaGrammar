package chap08.Test3;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("sell order");
    }
}
