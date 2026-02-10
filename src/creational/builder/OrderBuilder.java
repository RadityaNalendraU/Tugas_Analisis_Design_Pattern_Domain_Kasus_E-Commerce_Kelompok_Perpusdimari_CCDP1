package creational.builder;

public class OrderBuilder {
    // Sesuai diagram: -Order order
    private Order order = new Order();

    // Method chaining sesuai diagram (return OrderBuilder)
    public OrderBuilder setAddress(String addr) {
        order.setAddress(addr);
        return this;
    }

    public OrderBuilder setCourier(String courier) {
        order.setCourier(courier);
        return this;
    }

    public OrderBuilder addItem(String item) {
        order.setItem(item);
        return this;
    }

    // Sesuai diagram: +build() : Order
    public Order build() {
        return this.order;
    }
}