package composite;

public class File extends TreeElement {
    public File(String name) {
        super(name);
    }

    @Override
    void printName(String parentName) {
        System.out.println(parentName + "/" + this.name);
    }
}
