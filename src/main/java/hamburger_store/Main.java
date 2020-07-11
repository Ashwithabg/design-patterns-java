package hamburger_store;

import hamburger_store.model.HamburgerStore;
import hamburger_store.model.MangaloreStyleHamburgerStore;

public class Main {
    public static void main(String[] args) {
        HamburgerStore hamburgerStore = new MangaloreStyleHamburgerStore();
        hamburgerStore.orderBurger("cheese");
    }
}
