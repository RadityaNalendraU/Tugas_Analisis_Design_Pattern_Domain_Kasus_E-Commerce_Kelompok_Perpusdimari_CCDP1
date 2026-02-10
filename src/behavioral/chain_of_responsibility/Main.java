package behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi handler
        PaymentHandler login = new LoginValidation();
        PaymentHandler stock = new StockValidation();
        PaymentHandler balance = new BalanceValidation();

        // Menyusun rantai: Login -> Stock -> Balance
        login.setNext(stock);
        stock.setNext(balance);

        // Simulasi request yang valid
        System.out.println("--- Percobaan 1: Data Lengkap ---");
        String requestValid = "logged_in, in_stock, enough_balance";
        login.handle(requestValid);

        System.out.println("\n--- Percobaan 2: Saldo Kurang ---");
        String requestInvalid = "logged_in, in_stock";
        login.handle(requestInvalid);
    }
}
