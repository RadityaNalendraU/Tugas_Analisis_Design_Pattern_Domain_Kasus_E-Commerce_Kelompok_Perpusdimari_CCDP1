package structural.decorator;
public class Insurance extends ProductDecorator {
    public Insurance(Product p) { super(p); }
    public String getDescription() { return decoratedProduct.getDescription() + " + Asuransi"; }
    public double getCost() { return decoratedProduct.getCost() + 100000; }
}