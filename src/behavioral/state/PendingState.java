package behavioral.state;

public class PendingState implements OrderState {
    @Override
    public void next(OrderContext order) {
        order.setState(new PaidState());
    }

    @Override
    public void printStatus() {
        System.out.println("Status: Menunggu Pembayaran.");
    }
}