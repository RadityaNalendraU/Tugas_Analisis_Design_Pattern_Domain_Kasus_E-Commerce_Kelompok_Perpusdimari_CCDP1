package creational.prototype;
import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    private Map<String, ProductPrototype> prototypes = new HashMap<>();

    public void addPrototype(String key, ProductPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public ProductPrototype getClone(String key) {
        return prototypes.get(key).clone();
    }
}