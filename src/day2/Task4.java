package day2;

import java.util.Scanner;

public class Task4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите вещественное число: ");
        double x = scanner.nextDouble();

        double y = 420;

        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        }

        if (x > -3 && x < 5) {
            y = (x + 3) / (x * x - 2);
        }

        System.out.println("Ответ: " + y);
    }
}
