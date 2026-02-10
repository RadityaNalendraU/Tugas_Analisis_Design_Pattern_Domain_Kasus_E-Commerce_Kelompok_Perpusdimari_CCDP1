package structural.decorator;
public abstract class ProductDecorator implements Product {
    protected Product decoratedProduct;
    public ProductDecorator(Product p) { this.decoratedProduct = p; }
}