import java.util.Arrays;
import java.util.List;

public class Database implements Repository {

    @Override
    public List<String> findData() {
        System.out.println("Fetched from database");
        return Arrays.asList("Spiderman", "Avengers: Endgame", "Guardians of the Galaxy");
    }
}
