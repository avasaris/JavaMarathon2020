package day6;

/**
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров,
 * вызвать метод fillUp() два раза, передав разные значения.
 * Вызвать метод info().
 */

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Tupolev", 2020, 15, 800);

        System.out.println(plane.info());

        plane.setYear(1990);
        plane.setLength(25);

        plane.fillUp(20);
        plane.fillUp(6);

        System.out.println(plane.info());
    }
}
