package simple_hamburger_store.model;

public class MeatBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("preparing with meat");
    }
}
