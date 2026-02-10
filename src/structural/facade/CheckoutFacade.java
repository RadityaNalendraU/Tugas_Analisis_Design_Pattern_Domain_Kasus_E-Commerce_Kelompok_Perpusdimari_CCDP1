package structural.facade;

public class CheckoutFacade {
    private InventorySystem inventory = new InventorySystem();
    private PaymentGateway payment = new PaymentGateway();
    private ShippingService shipping = new ShippingService();

    public void placeOrder(String productId, String userId) {
        inventory.checkStock(productId);
        payment.charge(userId, 50000);
        shipping.calculateFees(userId);
        inventory.updateStock(productId);
        shipping.arrangeDelivery(productId);
    }
}