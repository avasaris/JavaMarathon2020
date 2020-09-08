package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Реализовать программу, записывающую числа разных типов в 2 файла.
 * Файл 1 содержит 1000 случайных чисел от 0 до 100.
 * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
 * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается
 * их среднее арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2
 * будет находиться 50 вещественных чисел (1000 / 20 = 50).
 * После того, как Файл 2 будет сформирован, необходимо найти сумму всех вещественных чисел из Файла 2
 * и вывести в консоль ответ, отбросив его вещественную часть.
 * Пример:
 * Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из 4 целых чисел.
 *
 * Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
 * Файл 2: 5.75 26.5 34.5
 * Ответ: 66
 */
public class Task2 {
    public static final String FILE1 = "./src/day16/file1.txt";
    public static final String FILE2 = "./src/day16/file2.txt";

    public static void main(String[] args) throws FileNotFoundException {
        generateFile1();
        generateFile2();
        printFile2Sum();
    }

    public static void generateFile1() throws FileNotFoundException {
        File file = new File(FILE1);
        PrintWriter pw = new PrintWriter(file);

        for (int i = 0; i < 1000; i++) pw.println(ThreadLocalRandom.current().nextInt(0, 101));

        pw.close();
    }

    public static void generateFile2() throws FileNotFoundException {
        File fileIn = new File(FILE1);
        File fileOut = new File(FILE2);

        Scanner scanner = new Scanner(fileIn);
        PrintWriter pw = new PrintWriter(fileOut);

        while (scanner.hasNextInt()) {
            double sum = 0;
            for (int i = 0; i < 20; i++) sum += scanner.nextInt();
            sum /= 20.0;

            pw.println(sum);
        }

        scanner.close();
        pw.close();
    }

    private static void printFile2Sum() throws FileNotFoundException {
        File file = new File(FILE2);
        Scanner scanner = new Scanner(file);

        double sum = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            sum += Double.parseDouble(line);
        }
        sum /= 50;

        scanner.close();

        System.out.println(sum);
    }

}
