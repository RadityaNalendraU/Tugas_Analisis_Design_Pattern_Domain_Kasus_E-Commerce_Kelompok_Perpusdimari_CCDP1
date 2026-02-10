package behavioral.strategy;

public class Cart {
    private DiscountStrategy strategy;

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double total) {
        double finalPrice = strategy.applyDiscount(total);
        System.out.println("Total Awal: Rp" + total);
        System.out.println("Total Setelah Diskon: Rp" + finalPrice);
    }
}
