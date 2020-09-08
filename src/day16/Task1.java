package day16;

/*
 *  Реализовать программу, которая на вход принимает txt файл с целыми числами (можно использовать
 *  файл из задания 1 дня 14) и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного
 * числа (со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
 * Пример:
 * Числа в txt файле: 5 2 8 34 1 36 77
 * Ответ: 23.285714285714285 --> 23,286
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Math.round;

public class Task1 {
    public static final String FILE = "./src/day16/digits.txt";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(FILE);
        Scanner scanner = new Scanner(file);

        String[] strDigits = scanner.nextLine().split(" ");

        scanner.close();

        double sum = 0;
        for (String strDigit : strDigits) {
            sum += Integer.parseInt(strDigit);
        }
        sum /= strDigits.length;

        System.out.println(sum);
        System.out.println(round(sum * 1000) / 1000.0);
    }
}
