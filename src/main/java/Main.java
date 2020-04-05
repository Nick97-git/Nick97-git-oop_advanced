import java.util.ArrayList;
import java.util.List;
import shapes.Circle;
import shapes.RandomGenerator;
import shapes.Shape;
import shapes.Square;
import shapes.Trapeze;
import shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square());
        shapes.add(new Triangle());
        shapes.add(new Trapeze());
        shapes.add(new Circle());
        RandomGenerator generator = new RandomGenerator();
        for (int i = 0; i < generator.getRandomNum(100) + 1; i++) {
            int index = generator.getRandomNum(shapes.size());
            Shape generatedShape = shapes.get(index).createShape();
            System.out.println(generatedShape.toString());
        }
    }
}
