package structural.adapter;

public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi API pihak ketiga
        MidtransAPI apiLuar = new MidtransAPI();

        // 2. Masukkan ke dalam adapter agar bisa dikenali sistem
        PaymentProcessor payment = new MidtransAdapter(apiLuar);

        // 3. Jalankan pembayaran (sistem tidak perlu tahu ada Midtrans di dalamnya)
        System.out.println("--- Memulai Proses Check Out ---");
        payment.pay(250000.0);
        
        System.out.println("\nAdapter Berhasil: Sistem tetap menggunakan method 'pay()'");
    }
}