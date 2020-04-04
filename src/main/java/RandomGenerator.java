import java.util.Random;

public class RandomGenerator {
    private Random random;
    private String[] colors = {"желтый", "синий", "красный", "зеленый",
            "фиолетовый", "коричневый", "черный", "оранжевый"};

    public RandomGenerator() {
        random = new Random();
    }

    public int getRandomNum(int bound) {
        return random.nextInt(bound);
    }

    public String getRandomColour() {
        return colors[getRandomNum(colors.length)];
    }
}
