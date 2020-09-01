package day9.Task2;

public class TestFigures {
    public static double calculatePerimeterForColor(Figure[] figures, String color){
        double perimeter = 0;

        for(Figure figure: figures){
            if(figure.getColor().equalsIgnoreCase(color)) perimeter += figure.perimeter();
        }

        return perimeter;
    }

    public static double calculateAreaForColor(Figure[] figures, String color){
        double area = 0;

        for(Figure figure: figures){
            if(figure.getColor().equalsIgnoreCase(color)) area += figure.area();
        }

        return area;
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        return calculatePerimeterForColor(figures, "red");
    }

    public static double calculateRedArea(Figure[] figures) {
        return calculateAreaForColor(figures, "red");
    }

    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }
}
