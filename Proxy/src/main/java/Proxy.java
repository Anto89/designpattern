import java.util.List;

public class Proxy implements Repository {
    private List<String> cache = null;
    private Repository repository;

    public Proxy() {
        this.repository = new Database();
    }

    @Override
    public List<String> findData() {
        if (cache == null) {
            List<String> data = repository.findData();
            cache = data;
            return data;
        }

        System.out.println("Already in cache");
        return cache;
    }
}
