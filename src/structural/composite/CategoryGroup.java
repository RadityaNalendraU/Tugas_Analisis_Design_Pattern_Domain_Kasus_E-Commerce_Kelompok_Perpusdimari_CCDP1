package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CategoryGroup implements CatalogComponent {
    private String name;
    private List<CatalogComponent> components = new ArrayList<>();

    public CategoryGroup(String name) {
        this.name = name;
    }

    public void addComponent(CatalogComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Kategori: " + name);
        for (CatalogComponent component : components) {
            component.showDetails();
        }
    }
}