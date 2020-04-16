package decorator;

public abstract class BaseDecorator implements Notifier {
    private Notifier customNotifier;

    public BaseDecorator(Notifier customNotifier) {
        this.customNotifier = customNotifier;
    }

    @Override
    public String notifyTopic() {
        return customNotifier.notifyTopic();
    }
}
