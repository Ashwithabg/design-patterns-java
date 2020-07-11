package simple_hamburger_store.model;

public abstract class Hamburger {
    void prepare() {
        System.out.println("preparing ");
    }

    void cook() {
        System.out.println("cooking ");
    }

    void box() {
        System.out.println("box");
    }
}
