package behavioral.chain_of_responsibility;

public class BalanceValidation extends PaymentHandler {
    @Override
    public void handle(String request) {
        System.out.println("Memeriksa saldo...");
        if (request.contains("enough_balance")) {
            System.out.println("✔ Saldo mencukupi.");
            passToNext(request);
        } else {
            System.out.println("✘ Error: Saldo tidak cukup!");
        }
    }
}