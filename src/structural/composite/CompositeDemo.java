package structural.composite;

public class CompositeDemo { 
    public static void main(String[] args) {
        CategoryGroup mainCatalog = new CategoryGroup("Katalog Toko");

        CategoryGroup electronics = new CategoryGroup("Elektronik");
        electronics.addComponent(new ProductItem("Laptop ASUS", 15000000));
        electronics.addComponent(new ProductItem("Smartphone Samsung", 7000000));

        mainCatalog.addComponent(electronics);
        mainCatalog.addComponent(new ProductItem("Buku Pemrograman", 150000));

        System.out.println("--- Memulai Tampilan Katalog (Composite Pattern) ---");
        mainCatalog.showDetails();
    }
}