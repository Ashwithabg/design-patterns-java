package payment_system.model;

import java.util.Objects;

public class Product {
    private int price;
    private String upcCode;

    public Product(int price, String upcCode) {
        this.price = price;
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                Objects.equals(upcCode, product.upcCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, upcCode);
    }
}
