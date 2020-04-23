import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Insectarium {
    private List<Insect> insects;

    public Insectarium(int number) {
        insects = IntStream.range(0, number).mapToObj(i -> {
            Random random = new Random();
            InsectType insectType = InsectType.values()[random.nextInt(2)];
            return InsectFactory.getInsect(insectType);
        }).collect(Collectors.toList());
    }

    public void watchThem() {
        insects.forEach(insect -> {
            Random random = new Random();
            insect.moveToDestination(random.nextInt(101), random.nextInt(101));
        });
    }
}
