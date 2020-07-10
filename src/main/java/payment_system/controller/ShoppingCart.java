package payment_system.controller;

import payment_system.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;


    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int calculateTotalAmount() {
        return products.stream()
                .map(product -> product.getPrice())
                .reduce(0, Integer::sum);
    }

    public void pay(Payment paymentStrategy) {
        paymentStrategy.pay(calculateTotalAmount());
    }
}
