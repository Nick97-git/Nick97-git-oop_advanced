public class Triangle extends Shape {
    private int sideA;
    private int sideB;

    public Triangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return (double) (sideA * sideB) / 2;
    }

    double getHypotenuse() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public void draw() {
        String info = "Фигура: треугольник" + ", площадь: " + getArea()
                + " кв. ед., длина гипотенузы: " + getHypotenuse()
                + " ед., цвет: " + getColor();
        System.out.println(info);
    }
}
