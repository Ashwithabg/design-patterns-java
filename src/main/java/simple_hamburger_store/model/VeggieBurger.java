package simple_hamburger_store.model;

public class VeggieBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("preparing with veggie");
    }
}
