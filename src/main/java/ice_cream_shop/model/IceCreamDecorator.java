package ice_cream_shop.model;

import ice_cream_shop.IceCream;

public class IceCreamDecorator implements IceCream {
    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        return iceCream.cost();
    }
}
