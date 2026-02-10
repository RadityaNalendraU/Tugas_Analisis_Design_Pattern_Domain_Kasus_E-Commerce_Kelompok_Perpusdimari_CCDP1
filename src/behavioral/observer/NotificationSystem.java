package behavioral.observer;

public class NotificationSystem implements Observer {
    // Sesuai diagram: -String name
    private String name;

    public NotificationSystem(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Notifikasi untuk " + name + ": Pesanan Anda saat ini " + status);
    }
}