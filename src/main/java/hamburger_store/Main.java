package hamburger_store;

import hamburger_store.model.HamburgerStore;
import hamburger_store.model.SimpleHamburgerFactory;

public class Main {
    public static void main(String[] args) {
        SimpleHamburgerFactory factory = new SimpleHamburgerFactory();
        HamburgerStore hamburgerStore = new HamburgerStore(factory);
        hamburgerStore.orderBurger("cheese");
    }
}
