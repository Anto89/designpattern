package decorator;

public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(Notifier customNotifier) {
        super(customNotifier);
    }

    @Override
    public String notifyTopic() {
        return super.notifyTopic() + "\n -> also send via Slack";
    }
}
