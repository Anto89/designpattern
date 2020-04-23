import java.util.stream.Collectors;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void displayMovies() {
        String result = repository.findData().stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
