public class Main {
    public static void main(String[] args) {
        // Jika ingin tampilan Web
        UIFactory factory = new MobileUIFactory();
        Client app = new Client(factory);
        
        System.out.println("Aplikasi dijalankan:");
        app.paint();
    }
}