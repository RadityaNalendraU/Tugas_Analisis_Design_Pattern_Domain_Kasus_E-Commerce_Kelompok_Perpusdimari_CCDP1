package creational.builder;

import structural.decorator.*;
import behavioral.observer.*;

public class Main {
    public static void main(String[] args) {
        // Dekorator Produk
        Product myProduct = new SimpleProduct();
        myProduct = new GiftWrap(myProduct);
        myProduct = new Insurance(myProduct);

        System.out.println("Produk Terpilih: " + myProduct.getDescription());
        System.out.println("Total Harga: Rp" + myProduct.getCost());

        // Builder Pesanan
        Order finalOrder = new OrderBuilder()
                .addItem(myProduct.getDescription())
                .setAddress("Jl. Sudirman No. 10, Jakarta")
                .setCourier("JNE Express")
                .build();
        
        finalOrder.show();

        // Observer Notifikasi
        StockManager stock = new StockManager();
        stock.addObserver(new NotificationSystem("Admin Gudang"));
        stock.addObserver(new NotificationSystem("Pembeli"));

        stock.setStockStatus("Barang Sedang Dikirim");
    }
}