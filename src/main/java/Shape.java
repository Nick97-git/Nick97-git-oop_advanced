public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();

    public String getColor() {
        return color.toString().toLowerCase();
    }
}
