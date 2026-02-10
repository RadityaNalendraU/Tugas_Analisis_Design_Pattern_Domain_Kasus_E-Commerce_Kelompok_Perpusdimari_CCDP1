// Kelas Produk yang akan dibangun
class Order {
    private String address;
    private String courier;
    private String item;

    public void setAddress(String a) { this.address = a; }
    public void setCourier(String c) { this.courier = c; }
    public void setItem(String i) { this.item = i; }

    public void show() {
        System.out.println("--- Detail Pesanan ---");
        System.out.println("Item    : " + item);
        System.out.println("Alamat  : " + address);
        System.out.println("Kurir   : " + courier);
    }
}

// Kelas Builder
class OrderBuilder {
    private Order order = new Order();

    public OrderBuilder setAddress(String addr) {
        order.setAddress(addr);
        return this; // Mengembalikan instance builder untuk chaining
    }

    public OrderBuilder setCourier(String courier) {
        order.setCourier(courier);
        return this;
    }

    public OrderBuilder addItem(String item) {
        order.setItem(item);
        return this;
    }

    public Order build() {
        return this.order;
    }
}