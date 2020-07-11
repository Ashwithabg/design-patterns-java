package ice_cream_shop.model;

import ice_cream_shop.IceCream;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding mint");
        return 1.0 + super.cost();
    }
}
