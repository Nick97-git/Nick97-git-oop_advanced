package shapes;

public class Triangle extends Shape {
    private int sideA;
    private int sideB;

    public Triangle() {
        RandomGenerator generator = new RandomGenerator();
        sideA = generator.getRandomNum(20);
        sideB = generator.getRandomNum(20);
    }

    public double getArea() {
        return (double) (sideA * sideB) / 2;
    }

    public String getDraw() {
        return "треугольник";
    }

    double getHypotenuse() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public Shape createShape() {
        return new Triangle();
    }

    @Override
    public String toString() {
        return "Фигура: " + getDraw() + ", площадь: " + getArea()
                + " кв. ед., длина гипотенузы: " + getHypotenuse()
                + " ед., цвет: " + getColor();
    }
}
