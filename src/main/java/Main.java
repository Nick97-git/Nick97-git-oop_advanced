import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RandomGenerator generator = new RandomGenerator();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square());
        shapes.add(new Triangle());
        shapes.add(new Trapeze());
        shapes.add(new Circle());
        for (int i = 0; i < generator.getRandomNum(100); i++) {
            int index = generator.getRandomNum(shapes.size());
            Shape generatedShape = shapes.get(index).createShape();
            System.out.println(generatedShape.toString());
        }
    }
}
