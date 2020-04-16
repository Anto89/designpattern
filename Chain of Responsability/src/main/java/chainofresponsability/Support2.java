package chainofresponsability;

public class Support2 extends BaseHandler {
    public Support2(Handler successor) {
        super(successor);
    }

    public String handle(RequestIssue requestIssue) {
        if (RequestIssue.Type.TECHNICAL == requestIssue.getType() &&
                requestIssue.getDifficulty() < 100) {
            return "Hi, your problem does'nt look to difficult to solve, team support 2 have this.";
        }
        return nextHandle(requestIssue);
    }
}
