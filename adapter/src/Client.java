import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String... args) {
        List<Service> servicesToExecute = List.of(new ServiceImpl(), new LegacyServiceAdapter(new LegacyService()));
        System.out.println("We want to execute all services, even the old ones :");
        servicesToExecute.forEach(Service::doSomething);
    }
}
