package pl.sda.patterns.behavioral.strategy;

public class CashPaymentStrategy implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("pay by cash");
    }
}
