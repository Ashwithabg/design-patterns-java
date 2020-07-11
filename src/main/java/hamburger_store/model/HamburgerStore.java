package hamburger_store.model;

public abstract class HamburgerStore {
    public HamburgerStore() {
    }

    public Hamburger orderBurger(String type) {
        Hamburger hamburger = createHamburger(type);
        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

        return hamburger;
    }

    abstract public Hamburger createHamburger(String type);
}
