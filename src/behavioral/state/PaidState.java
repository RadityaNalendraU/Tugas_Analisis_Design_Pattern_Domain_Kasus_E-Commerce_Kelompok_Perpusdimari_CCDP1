package behavioral.state;

public class PaidState implements OrderState {
    @Override
    public void next(OrderContext order) {
        order.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Status: Pembayaran Berhasil (Sudah Dibayar).");
    }
}