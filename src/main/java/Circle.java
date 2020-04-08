public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    double getLengthOfCircle() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        String info = "Фигура: круг" + ", площадь: " + getArea()
                + " кв. ед., длина круга: " + getLengthOfCircle()
                + " ед., цвет: " + getColor();
        System.out.println(info);
    }
}
