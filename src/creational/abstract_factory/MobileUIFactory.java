public class MobileUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MobileButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MobileCheckbox();
    }
}