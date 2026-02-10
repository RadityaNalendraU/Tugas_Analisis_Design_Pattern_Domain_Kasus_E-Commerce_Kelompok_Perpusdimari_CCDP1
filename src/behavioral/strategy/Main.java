package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Cart keranjang = new Cart();

        System.out.println("--- Skenario Promo Ramadhan ---");
        keranjang.setDiscountStrategy(new RamadhanDiscount());
        keranjang.checkout(100000);

        System.out.println("\n--- Skenario Diskon Member ---");
        keranjang.setDiscountStrategy(new MemberDiscount());
        keranjang.checkout(100000);
    }
}