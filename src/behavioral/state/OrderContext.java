package behavioral.state;

public class OrderContext {
    private OrderState state = new PendingState();

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextStep() {
        state.next(this);
    }

    public void showStatus() {
        state.printStatus();
    }
}