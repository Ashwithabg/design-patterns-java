package ice_cream_shop;

import ice_cream_shop.model.BasicIceCream;
import ice_cream_shop.model.ChocolateIceCream;
import ice_cream_shop.model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic ice cream cost: " + basicIceCream.cost());

        VanillaIceCream vanillaIceCream = new VanillaIceCream(basicIceCream);
        System.out.println("Basic ice cream with vanilla: " + vanillaIceCream.cost());

        ChocolateIceCream chocolateIceCream = new ChocolateIceCream(vanillaIceCream);
        System.out.println("Basic ice cream with vanilla and chocolate: " + chocolateIceCream.cost());
    }
}
