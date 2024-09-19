package hnt.coding.interview.design.behavior.strategy;

public class Application {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment("100", "HNT"));
        context.payAmount(100);

        context.setPaymentStrategy(new PayPalPayment("hnt@gmail.com"));
        context.payAmount(200);
    }
}
