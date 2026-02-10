package behavioral.chain_of_responsibility;

public class LoginValidation extends PaymentHandler {
    @Override
    public void handle(String request) {
        System.out.println("Memeriksa status Login...");
        if (request.contains("logged_in")) {
            System.out.println("✔ User sudah login.");
            passToNext(request);
        } else {
            System.out.println("✘ Error: User belum login!");
        }
    }
}