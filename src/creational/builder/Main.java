public class Main {
    public static void main(String[] args) {
        
        Product myProduct = new SimpleProduct();
        myProduct = new GiftWrap(myProduct);
        myProduct = new Insurance(myProduct);

        System.out.println("Produk: " + myProduct.getDescription());
        System.out.println("Total Harga: Rp" + myProduct.getCost());

        Order finalOrder = new OrderBuilder()
                .addItem(myProduct.getDescription())
                .setAddress("Jl. Sudirman No. 10, Jakarta")
                .setCourier("JNE Express")
                .build();
        
        finalOrder.show();

        StockManager stock = new StockManager();
        NotificationSystem adminNotif = new NotificationSystem("Admin Gudang");
        NotificationSystem userNotif = new NotificationSystem("Pembeli");

        stock.addObserver(adminNotif);
        stock.addObserver(userNotif);

        stock.setStockStatus("Hampir Habis (Sisa 2)");
        stock.setStockStatus("Barang Dikirim");
    }
}