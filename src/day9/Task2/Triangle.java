package day9.Task2;

public class Triangle extends Figure {
    private double lengthA, lengthB, lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double p = (lengthA + lengthB + lengthC) / 2.0;
        return Math.sqrt(p * (p - lengthA) * (p - lengthB) * (p - lengthC));
    }

    @Override
    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }
}
