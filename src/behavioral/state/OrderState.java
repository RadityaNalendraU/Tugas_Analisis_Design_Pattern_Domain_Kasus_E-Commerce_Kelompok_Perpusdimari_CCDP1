package behavioral.state;

public interface OrderState {
    void next(OrderContext order);
    void printStatus();
}