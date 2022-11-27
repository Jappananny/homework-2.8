import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Multi {
    private final Set<Number> numberSet = new HashSet<>();

    public Multi() {
        Random random = new Random();
        while (numberSet.size() < 15) {
            numberSet.add(new Number(random.nextInt(10), random.nextInt(10)));
        }
    }

}
