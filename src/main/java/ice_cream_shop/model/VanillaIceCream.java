package ice_cream_shop.model;

import ice_cream_shop.IceCream;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding vanilla");
        return 2.0 + super.cost();
    }
}

