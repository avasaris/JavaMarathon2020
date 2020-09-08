package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Вам дан файл с информацией об остатках обуви на складе, это пример реальной выгрузки остатков
 * из 1С в csv файл (формат файла с разделителями, в качестве разделителя использован символ “;”).
 * В этом файле содержится информация о названии модели обуви, ее размер и оставшееся на складе количество.
 *
 * До преобразования в csv это была таблица с тремя колонками:
 *
 * Название 						   Размер	   Кол-во
 * Ботинки HS РАН-Р 400 чер. ЗП			45		4
 * Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
 * ...
 *
 * Необходимо сформировать новый файл с информацией о моделях и размерах обуви, которой нет на
 * складе (количество = 0). Для этого реализуйте программу, которая принимает на вход csv файл
 * и создает новый txt файл следующего содержания (должно получиться 11 строк):
 *
 * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 */

public class Task1 {
    public static final String CSV_FILE = "./src/day15/shoes.csv";
    public static final String OUT_FILE = "./src/day15/shoes.txt";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(CSV_FILE);
        Scanner scanner = new Scanner(file);

        List<String> content = new ArrayList<>();
        while (scanner.hasNextLine()) content.add(scanner.nextLine());

        scanner.close();

        file = new File(OUT_FILE);
        PrintWriter pw = new PrintWriter(file);

        for (String line : content) {
            String[] arr = line.split(";");

            if(arr[2].equals("0")) {
                pw.println(String.join(", ", arr));
            }
        }

        pw.close();
    }
}
