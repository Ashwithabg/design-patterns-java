package hamburger_store.model;

public abstract class Hamburger {
    void prepare(){
        System.out.println("prepare");
    }

    void cook(){
        System.out.println("cook");
    }

    void box(){
        System.out.println("box");
    }
}
