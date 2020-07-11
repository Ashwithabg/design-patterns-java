package simple_hamburger_store;

import simple_hamburger_store.model.HamburgerStore;
import simple_hamburger_store.model.SimpleHamburgerFactory;

public class Main {
    public static void main(String[] args) {

        SimpleHamburgerFactory simpleHamburgerFactory = new SimpleHamburgerFactory();
        HamburgerStore hamburgerStore = new HamburgerStore(simpleHamburgerFactory);
        hamburgerStore.orderBurger("cheese");
    }
}
