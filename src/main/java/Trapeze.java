public class Trapeze extends Shape {
    private int sideA;
    private int sideB;
    private int height;

    public Trapeze(Color color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getArea() {
        return (double) (height * (sideA + sideB)) / 2;
    }

    double getMiddleLine() {
        return (double) (sideA + sideB) / 2;
    }

    public void draw() {
        String info = "Фигура: трапеция" + ", площадь: " + getArea()
                + " кв. ед., длина средней линии: " + getMiddleLine()
                + " ед., цвет: " + getColor();
        System.out.println(info);
    }
}
