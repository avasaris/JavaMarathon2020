package day3;

/*
Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль. Программа останавливает
свою работу тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).
 */

import java.util.Scanner;

public class Task2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Для завершения программы введите 0 в качестве делителя.");

        while (true) {
            System.out.print("Введите делимое и делитель через пробел: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y == 0) break;

            System.out.println("Результат деления: " + x / y);

        }
    }
}
