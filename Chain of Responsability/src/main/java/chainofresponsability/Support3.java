package chainofresponsability;

public class Support3 extends BaseHandler {
    public Support3() {
        super();
    }

    public String handle(RequestIssue requestIssue) {
        if (RequestIssue.Type.TECHNICAL == requestIssue.getType() &&
                requestIssue.getDifficulty() >= 100) {
            return "Hmm ... not that easy but it should be fine.";
        }
        return "Sorry, nobody can help :(";
    }
}