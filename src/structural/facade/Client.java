package structural.facade;

public class Client {
    public void clickCheckout() {
        CheckoutFacade facade = new CheckoutFacade();
        facade.placeOrder("Barang-A", "User-01");
    }
}