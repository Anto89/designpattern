package abstractfactory;

public class OceanThemeFactory extends ThemeFactory {
    @Override
    public Button createButton() {
        return new OceanThemeButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new OceanThemeCheckbox();
    }
}
