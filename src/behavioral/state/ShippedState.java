package behavioral.state;

public class ShippedState implements OrderState {
    @Override
    public void next(OrderContext order) {
        System.out.println("Pesanan sudah sampai di tangan pelanggan.");
    }

    @Override
    public void printStatus() {
        System.out.println("Status: Barang dalam Pengiriman.");
    }
}