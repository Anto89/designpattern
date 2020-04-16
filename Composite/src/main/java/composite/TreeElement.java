package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class TreeElement {
    protected String name;
    protected List<TreeElement> children = new ArrayList<>();

    abstract void printName(String parentName);

    public TreeElement(String name) {
        this.name = name;
    }
}
