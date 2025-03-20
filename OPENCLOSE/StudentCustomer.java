package OPENCLOSE;

public class StudentCustomer implements CalculateDiscount {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05; 
    }
}
