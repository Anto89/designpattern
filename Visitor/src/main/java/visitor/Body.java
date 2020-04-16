package visitor;

public class Body implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
