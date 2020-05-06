package abstractfactory;

public class MountainThemeFactory extends ThemeFactory {
    @Override
    public Button createButton() {
        return new MountainThemeButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MountainThemeCheckbox();
    }
}
