package OPENCLOSE;

public class DiscountTest {
    public static void main(String[] args) {
        Customer student = new Customer("Alice", new StudentCustomer());
        Customer senior = new Customer("Bob", new SeniorCustomer());
        Customer regular = new Customer("Charlie", new RegularCustomer());

        double amount = 100.0;

        System.out.println(student.getName() + " pays: ₱" + student.applyDiscount(amount));
        System.out.println(senior.getName() + " pays: ₱" + senior.applyDiscount(amount));
        System.out.println(regular.getName() + " pays: ₱" + regular.applyDiscount(amount));
    }
}
