package decorator;

public class Client {
    public static void main(String... args) {
        NewsNotifier news = new NewsNotifier("Everyone's free to go out !!");
        Notifier notifier = new SlackDecorator(new SmsDecorator(news));

        System.out.println(notifier.notifyTopic());
    }
}
