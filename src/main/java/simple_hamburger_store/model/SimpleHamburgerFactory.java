package simple_hamburger_store.model;

public class SimpleHamburgerFactory {
    public Hamburger create(String type) {
        Hamburger hamburger = null;
        if (type.equals("cheese")) {
            hamburger = new CheeseBurger();
        } else if (type.equals("veggie")) {
            hamburger = new VeggieBurger();
        } else if (type.equals("meat")) {
            hamburger = new MeatBurger();
        }

        return hamburger;
    }
}
