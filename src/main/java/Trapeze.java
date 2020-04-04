public class Trapeze extends Shape {
    private int sideA;
    private int sideB;
    private int height;

    public Trapeze() {
        RandomGenerator generator = getGenerator();
        sideA = generator.getRandomNum(20);
        sideB = sideA + 15;
        height = generator.getRandomNum(20);
    }

    public double getSquare() {
        return (double) (height * (sideA + sideB)) / 2;
    }

    public String getDraw() {
        return "трапеция";
    }

    double getMiddleLine() {
        return (double) (sideA + sideB) / 2;
    }

    public Shape createShape() {
        return new Trapeze();
    }

    @Override
    public String toString() {
        return "Фигура: " + getDraw() + ", площадь: " + getSquare()
                + " кв. ед., длина средней линии: " + getMiddleLine()
                + " ед., цвет: " + getColor();
    }
}
