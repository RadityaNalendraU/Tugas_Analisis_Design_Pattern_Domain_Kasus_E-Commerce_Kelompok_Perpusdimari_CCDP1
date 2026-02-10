package creational.prototype;

public class ClothingProduct implements ProductPrototype {
    private String name;
    private String color;
    private String size;

    public ClothingProduct(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public ProductPrototype clone() {
        return new ClothingProduct(this.name, this.color, this.size);
    }

    public void setColor(String color) { this.color = color; }

    @Override
    public void display() {
        System.out.println("Produk: " + name + " | Warna: " + color + " | Ukuran: " + size);
    }
}