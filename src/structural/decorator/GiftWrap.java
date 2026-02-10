package structural.decorator;
public class GiftWrap extends ProductDecorator {
    public GiftWrap(Product p) { super(p); }
    public String getDescription() { return decoratedProduct.getDescription() + " + Bungkus Kado"; }
    public double getCost() { return decoratedProduct.getCost() + 25000; }
}