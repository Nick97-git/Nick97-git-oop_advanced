public class Square extends Shape {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    double getLengthOfSide() {
        return side;
    }

    public void draw() {
        String info = "Фигура: квадрат" + ", площадь: " + getArea()
                + " кв. ед., длина стороны: " + getLengthOfSide()
                + " ед., цвет: " + getColor();
        System.out.println(info);
    }
}
