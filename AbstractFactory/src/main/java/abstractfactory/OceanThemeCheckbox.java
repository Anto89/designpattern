package abstractfactory;

public class OceanThemeCheckbox implements Checkbox {
    @Override
    public void draw() {
        System.out.println("Blue checkbox");
    }
}
