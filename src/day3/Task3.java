package day3;
/*
Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
Ключевое слово else использовать в этой программе нельзя.
 */

import java.util.Scanner;

public class Task3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите делимое и делитель через пробел: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println("Результат деления: " + x / y);

        }
    }
}
