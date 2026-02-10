package structural.composite;

public class ProductItem implements CatalogComponent {
    private String name;
    private double price;

    public ProductItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println("  - Produk: " + name + " (Rp " + price + ")");
    }
}