package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle (String color) {
        super(color);
        this.radius = 0;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
