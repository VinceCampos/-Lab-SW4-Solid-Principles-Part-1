package DEPENDANCY;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("You are paying ₱" + amount + " using Cash");
    }
    
}
