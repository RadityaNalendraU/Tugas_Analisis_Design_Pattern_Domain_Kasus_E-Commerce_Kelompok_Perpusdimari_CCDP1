package creational.builder;

public class Order {
    // Sesuai diagram: -String address, -String courier, -String item
    private String address;
    private String courier;
    private String item;

    public void setAddress(String a) { this.address = a; }
    public void setCourier(String c) { this.courier = c; }
    public void setItem(String i) { this.item = i; }

    public void show() {
        System.out.println("--- Ringkasan Pesanan ---");
        System.out.println("Item    : " + item);
        System.out.println("Alamat  : " + address);
        System.out.println("Kurir   : " + courier);
        System.out.println("-------------------------");
    }
}