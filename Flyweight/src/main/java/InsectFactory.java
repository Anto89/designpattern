import java.util.EnumMap;

public class InsectFactory {
    private static EnumMap<InsectType, Insect> map = new EnumMap<>(InsectType.class);

    public static Insect getInsect(InsectType insectType) {
        return map.computeIfAbsent(insectType, Insect::new);
    }
}