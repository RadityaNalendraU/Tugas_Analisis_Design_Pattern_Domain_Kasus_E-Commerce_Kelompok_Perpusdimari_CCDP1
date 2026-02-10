package Structural.facade;

public class PaymentGateway {
    public void charge(String userId, double amount) {
        System.out.println("Menagih Rp" + amount + " ke " + userId);
    }
}