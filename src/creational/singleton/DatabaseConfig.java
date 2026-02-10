public class DatabaseConfig {
    // 1. Variabel static untuk menyimpan satu-satunya instansi
    private static DatabaseConfig instance;
    private String dbName;

    // 2. Constructor PRIVATE! Ini kunci agar tidak bisa di-"new" dari luar
    private DatabaseConfig() {
        this.dbName = "E-Commerce_Production_DB";
        System.out.println("--- Menginisialisasi Koneksi Database ---");
    }

    // 3. Method static untuk mendapatkan satu-satunya instansi
    public static synchronized DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public void getConnectionInfo() {
        System.out.println("Terhubung ke: " + dbName);
    }
}