package simple_hamburger_store.model;

public class CheeseBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("preparing with cheese");
    }
}
