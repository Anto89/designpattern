package decorator;

public class SmsDecorator extends BaseDecorator {
    public SmsDecorator(Notifier customNotifier) {
        super(customNotifier);
    }

    @Override
    public String notifyTopic() {
        return super.notifyTopic() + "\n -> also send via SMS";
    }
}
