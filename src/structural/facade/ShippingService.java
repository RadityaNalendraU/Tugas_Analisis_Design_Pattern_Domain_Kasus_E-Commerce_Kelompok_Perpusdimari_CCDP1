package structural.facade;

public class ShippingService {
    public void calculateFees(String userId) {
        System.out.println("Menghitung ongkir...");
    }
    public void arrangeDelivery(String productId) {
        System.out.println("Pesanan dikirim!");
    }
}