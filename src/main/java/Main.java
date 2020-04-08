import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < getRandomNumber(100); i++) {
            int randomShape = getRandomNumber(4);
            Color color = Color.values()[getRandomNumber(Color.values().length)];
            switch (randomShape) {
                case 0:
                    Circle circle = new Circle(color, getRandomNumber(30));
                    circle.draw();
                    break;
                case 1:
                    Square square = new Square(color, getRandomNumber(30));
                    square.draw();
                    break;
                case 2:
                    Triangle triangle = new Triangle(color, getRandomNumber(30),
                            getRandomNumber(40));
                    triangle.draw();
                    break;
                default:
                    Trapeze trapeze = new Trapeze(color, getRandomNumber(20),
                            getRandomNumber(40), getRandomNumber(10));
                    trapeze.draw();
                    break;
            }
        }
    }

    private static int getRandomNumber(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }
}
