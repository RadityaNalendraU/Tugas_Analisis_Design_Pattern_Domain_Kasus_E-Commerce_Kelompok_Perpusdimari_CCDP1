package behavioral.chain_of_responsibility;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;

    public void setNext(PaymentHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handle(String request);

    protected void passToNext(String request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("Semua validasi selesai. Request diterima!");
        }
    }
}