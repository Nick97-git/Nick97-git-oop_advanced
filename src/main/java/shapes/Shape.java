package shapes;

public abstract class Shape {

    protected String getColor() {
        return new RandomGenerator().getRandomColour();
    }

    public abstract double getArea();

    public abstract String getDraw();

    public abstract Shape createShape();
}
