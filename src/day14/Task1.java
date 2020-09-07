package day14;

/*
 * Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30). Заполнить его вручную
 * десятью произвольными числами. Реализовать программу, которая считает сумму всех чисел в этом файле
 * и выводит ее на экран.
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
 * в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10, необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static final String FILE_NAME = "./src/day14/test1_digits.txt";

    public static void main(String[] args) {

        int[] numbers = new int[10];

        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);

            int counter = 0;

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] lineNumbers = line.split("\\D+");

                for(String lineNumber : lineNumbers) {
                    try {
                        numbers[counter++] = Integer.parseInt(lineNumber);
                    } catch (Exception e) {
                        scanner.close();
                        throw e;
                    }

                }
            }

            scanner.close();

            if(counter < numbers.length) throw new ArrayIndexOutOfBoundsException();

            System.out.println(Arrays.toString(numbers));

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
