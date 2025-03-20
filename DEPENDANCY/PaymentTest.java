package DEPENDANCY;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor eWalletPayment = new PaymentProcessor(new EWallet());
        PaymentProcessor cashPayment = new PaymentProcessor(new Cash());
        PaymentProcessor creditCardPayment = new PaymentProcessor(new CreditCard());

        System.out.println("\nTesting Processing Payments:");
        eWalletPayment.processPayment(1000.0);
        cashPayment.processPayment(70.0);
        creditCardPayment.processPayment(5000.0);
    }
}
