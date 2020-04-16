package chainofresponsability;

public class RequestIssue {
    private final Type type;
    private final int difficulty;

    public RequestIssue(Type type, int difficulty) {
        this.type = type;
        this.difficulty = difficulty;
    }

    public enum Type {
        TECHNICAL, FUNCTIONNAL, OTHER
    }

    public Type getType() {
        return type;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
