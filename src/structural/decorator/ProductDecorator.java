// Interface Dasar
interface Product {
    String getDescription();
    double getCost();
}

// Implementasi Produk Dasar
class SimpleProduct implements Product {
    @Override
    public String getDescription() { return "Smartphone"; }
    @Override
    public double getCost() { return 5000000.0; }
}

// Base Decorator
abstract class ProductDecorator implements Product {
    protected Product decoratedProduct;
    public ProductDecorator(Product p) { this.decoratedProduct = p; }
}

// Concrete Decorator: Gift Wrap
class GiftWrap extends ProductDecorator {
    public GiftWrap(Product p) { super(p); }

    @Override
    public String getDescription() { return decoratedProduct.getDescription() + " + Gift Wrap"; }
    @Override
    public double getCost() { return decoratedProduct.getCost() + 25000.0; }
}

// Concrete Decorator: Insurance
class Insurance extends ProductDecorator {
    public Insurance(Product p) { super(p); }

    @Override
    public String getDescription() { return decoratedProduct.getDescription() + " + Insurance"; }
    @Override
    public double getCost() { return decoratedProduct.getCost() + 100000.0; }
}
