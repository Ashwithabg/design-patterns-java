package ice_cream_shop.model;

import ice_cream_shop.IceCream;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding chocolate");
        return 3.0 + super.cost();
    }
}
