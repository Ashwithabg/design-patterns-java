package hamburger_store.model;

public abstract class Hamburger {
    public String name;

    void prepare() {
        System.out.println("preparing " + name);
    }

    void cook() {
        System.out.println("cooking " + name);
    }

    void box() {
        System.out.println("box");
    }
}
