public class Main {
    public static void main(String[] args) {
        // Mencoba mendapatkan instance pertama
        DatabaseConfig connection1 = DatabaseConfig.getInstance();
        connection1.getConnectionInfo();

        // Mencoba mendapatkan instance kedua
        DatabaseConfig connection2 = DatabaseConfig.getInstance();
        connection2.getConnectionInfo();

        // PEMBUKTIAN: Cek apakah alamat memori/objeknya sama
        if (connection1 == connection2) {
            System.out.println("\nHasil: Objek connection1 dan connection2 IDENTIK.");
            System.out.println("Singleton Pattern: BERHASIL.");
        } else {
            System.out.println("\nHasil: Objek Berbeda.");
            System.out.println("Singleton Pattern: GAGAL.");
        }
    }
}