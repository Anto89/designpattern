package composite;

public class Directory extends TreeElement {
    public Directory(String name) {
        super(name);
    }

    void addElement(TreeElement element) {
        this.children.add(element);
    }

    void printName(String parentName) {
        System.out.println(String.format("** %s - %s element(s)", name, children.size()));
        children.forEach(child -> child.printName(parentName + "/" + name));
    }
}
