package hamburger_store.model;

public class MangaloreStyleHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")) {
            return new MangaloreStyleCheeseBurger();
        } else if (type.equals("veggie")) {
            return new MangaloreStyleVeggieBurger();
        }
        return null;
    }
}
