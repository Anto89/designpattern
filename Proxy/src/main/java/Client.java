public class Client {
    public static void main(String... args) {
        Service serviceWithoutProxy = new Service(new Database());
        Service service = new Service(new Proxy());

        System.out.println("Without caching");
        System.out.println("First try -> ");
        serviceWithoutProxy.displayMovies();
        System.out.println("Second try -> ");
        serviceWithoutProxy.displayMovies();

        System.out.println("With caching -> ");
        System.out.println("First try -> ");
        service.displayMovies();
        System.out.println("Second try -> ");
        service.displayMovies();
    }
}
