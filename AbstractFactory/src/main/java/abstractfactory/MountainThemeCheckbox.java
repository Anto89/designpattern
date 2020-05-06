package abstractfactory;

public class MountainThemeCheckbox implements Checkbox {
    @Override
    public void draw() {
        System.out.println("Green checkbox");
    }
}
