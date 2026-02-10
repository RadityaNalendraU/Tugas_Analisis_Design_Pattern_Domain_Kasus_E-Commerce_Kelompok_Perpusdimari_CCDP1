package structural.adapter;

public interface PaymentProcessor {
    // Sistem kita hanya mau tahu cara manggil "pay"
    void pay(double amount);
}