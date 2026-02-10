package behavioral.chain_of_responsibility;

public class StockValidation extends PaymentHandler {
    @Override
    public void handle(String request) {
        System.out.println("Memeriksa stok barang...");
        if (request.contains("in_stock")) {
            System.out.println("✔ Stok tersedia.");
            passToNext(request);
        } else {
            System.out.println("✘ Error: Stok habis!");
        }
    }
}