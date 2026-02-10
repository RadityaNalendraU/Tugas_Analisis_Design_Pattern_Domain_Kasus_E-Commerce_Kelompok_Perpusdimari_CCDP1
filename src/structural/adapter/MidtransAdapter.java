package structural.adapter;

public class MidtransAdapter implements PaymentProcessor {
    private MidtransAPI midtrans;

    public MidtransAdapter(MidtransAPI midtrans) {
        this.midtrans = midtrans;
    }

    @Override
    public void pay(double amount) {
        // Menerjemahkan 'pay' ke fungsi 'kirimDana'
        midtrans.kirimDana(amount);
    }
}