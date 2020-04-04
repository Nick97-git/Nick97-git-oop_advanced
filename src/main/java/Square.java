public class Square extends Shape {
    private int side;

    public Square() {
        side = getGenerator().getRandomNum(20);
    }

    public double getSquare() {
        return side * side;
    }

    public String getDraw() {
        return "квадрат";
    }

    double getLengthOfSide() {
        return side;
    }

    public Shape createShape() {
        return new Square();
    }

    @Override
    public String toString() {
        return "Фигура: " + getDraw() + ", площадь: " + getSquare()
                + " кв. ед., длина стороны: " + getLengthOfSide()
                + " ед., цвет: " + getColor();
    }
}
