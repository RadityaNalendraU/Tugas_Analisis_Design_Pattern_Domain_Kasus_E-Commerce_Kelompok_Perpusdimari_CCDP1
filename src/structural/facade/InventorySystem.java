package Structural.facade;

public class InventorySystem {
    public void checkStock(String productId) {
        System.out.println("Mengecek stok untuk: " + productId);
    }
    public void updateStock(String productId) {
        System.out.println("Stok diperbarui.");
    }
}