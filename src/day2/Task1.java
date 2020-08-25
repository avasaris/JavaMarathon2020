package day2;

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите количество этажей в здании: ");
        int floor = scanner.nextInt();

        String message = "Вы ввели некорректное число";

        if (floor >= 1 && floor <= 4) {
            message = "Малоэтажный дом";
        }

        if (floor >= 5 && floor <= 8) {
            message = "Среднеэтажный дом";
        }

        if (floor >= 9) {
            message = "Многоэтажный дом";
        }

        System.out.println(message);
    }
}
