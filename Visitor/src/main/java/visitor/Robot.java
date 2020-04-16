package visitor;

import java.util.ArrayList;
import java.util.List;

public class Robot implements Element {
    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(e -> e.accept(visitor));
        visitor.visit(this);
    }
}
