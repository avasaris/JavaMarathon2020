package day7;

public class Task1 {
    public static void main(String[] args) {
        Plane planeA = new Plane("Antonov", 2000, 55, 5000);
        Plane planeB = new Plane("Bombardier", 2010, 65, 300);

        System.out.println("Первый самолет: " + planeA.info());
        System.out.println("Второй самолет: " + planeB.info());

        Plane.WhoIsLonger(planeA, planeB);
    }
}
