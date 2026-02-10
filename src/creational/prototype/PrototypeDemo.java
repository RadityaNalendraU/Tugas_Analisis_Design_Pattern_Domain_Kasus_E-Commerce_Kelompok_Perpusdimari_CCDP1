package creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        ProductRegistry registry = new ProductRegistry();
        
        ClothingProduct baseTshirt = new ClothingProduct("Kaos Polos", "Putih", "L");
        registry.addPrototype("KAOS_PUTIH", baseTshirt);

        ClothingProduct redTshirt = (ClothingProduct) registry.getClone("KAOS_PUTIH");
        redTshirt.setColor("Merah");

        System.out.println("--- Prototype Pattern Demo ---");
        baseTshirt.display();
        redTshirt.display();
    }
}