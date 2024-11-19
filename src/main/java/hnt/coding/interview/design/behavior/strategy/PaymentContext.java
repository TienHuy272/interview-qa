package hnt.coding.interview.design.behavior.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Use the strategy to pay the specified amount
    public void payAmount(double amount) {
        paymentStrategy.pay(amount);
      
    }
}
