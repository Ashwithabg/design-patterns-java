package payment_system;

import payment_system.controller.PayPal;
import payment_system.controller.ShoppingCart;
import payment_system.model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product1 = new Product(10, "UPC-1");
        Product product2 = new Product(15, "UPC-2");

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);


        shoppingCart.pay(new PayPal("test@test.com", "test"));
    }
}
