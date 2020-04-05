package shapes;

public class Circle extends Shape {
    private int radius;

    public Circle() {
        radius = new RandomGenerator().getRandomNum(30);
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public String getDraw() {
        return "круг";
    }

    double getLengthOfCircle() {
        return 2 * Math.PI * radius;
    }

    public Shape createShape() {
        return new Circle();
    }

    @Override
    public String toString() {
        return "Фигура: " + getDraw() + ", площадь: " + getSquare()
                + " кв. ед., длина круга: " + getLengthOfCircle()
                + " ед., цвет: " + getColor();
    }
}
