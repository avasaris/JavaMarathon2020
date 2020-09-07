package day14;

/*
 * Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей. Реализовать статический метод
 * List<String> parseFileToStringList(), который считывает содержимое этого файла и возвращает список, состоящий
 * из значений имен и возрастов каждого человека. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в
 * консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо выбрасывать
 * исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static final String FILE_NAME = "./src/day14/test2_data.txt";

    public static void main(String[] args) {
        try {
            List<String> list = parseFileToStringList();

            System.out.println(list);



        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static List<String> parseFileToStringList() throws FileNotFoundException, Exception {
        List<String> list = new ArrayList<>();

        File file = new File(FILE_NAME);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) list.add(scanner.nextLine());

        scanner.close();

        for(String line: list){
            int age = Integer.parseInt(line.split(" ")[1]);
            if(age < 0) throw new Exception("Некорректный входной файл");
        }

        return list;
    }
}
