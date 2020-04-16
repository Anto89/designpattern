package visitor;

public class CostVisitor implements Visitor {
    private int cost;

    public void visit(Head head) {
        cost += 13;
    }

    public void visit(Body body) {
        cost += 7;
    }

    public void visit(Foot foot) {
        cost += 2;
    }

    public void visit(Robot robot) {
        System.out.println(String.format("Final cost will be %d", cost));
    }
}
