package OPENCLOSE;

public class SeniorCustomer implements CalculateDiscount {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10; 
    }
}
