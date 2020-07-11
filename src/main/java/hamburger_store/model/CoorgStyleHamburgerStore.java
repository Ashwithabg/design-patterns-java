package hamburger_store.model;

public class CoorgStyleHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")) {
            return new CoorgStyleCheeseBurger();
        } else if (type.equals("veggie")) {
            return new CoorgStyleVeggieBurger();
        }
        return null;
    }
}
