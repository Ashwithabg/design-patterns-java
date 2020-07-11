package hamburger_store.model;

public class HamburgerStore {
    private SimpleHamburgerFactory factory;

    public HamburgerStore(SimpleHamburgerFactory factory) {
        this.factory = factory;
    }

    public Hamburger orderBurger(String type) {
        Hamburger hamburger = factory.create(type);
        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

        return hamburger;
    }
}
