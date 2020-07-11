package ice_cream_shop.model;

import ice_cream_shop.IceCream;

public class BasicIceCream implements IceCream {
    @Override
    public double cost() {
        return 1.0;
    }
}
