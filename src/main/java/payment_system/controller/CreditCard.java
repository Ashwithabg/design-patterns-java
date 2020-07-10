package payment_system.controller;

public class CreditCard implements Payment {
    private String name;
    private String cardNumber;

    public CreditCard(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "payed with credit card.");
    }
}
