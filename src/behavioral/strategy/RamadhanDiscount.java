package behavioral.strategy;

public class RamadhanDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // Potongan 20%
    }
}
