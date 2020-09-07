package day14;

/*
 * Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод List<Person> parseFileToObjList(),
 *  который считывает содержимое того же файла people.txt, создает экземпляры класса “Человек” и возвращает список
 *  объектов. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
 * в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо выбрасывать
 * исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    private static final String FILE_NAME = "./src/day14/test2_data.txt";

    public static List<Person> parseFileToObjList() throws Exception {
        List<Person> persons = new ArrayList<>();
        List<String> raws = new ArrayList<>();

        File file = new File(FILE_NAME);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) raws.add(scanner.nextLine());

        scanner.close();

        persons = parseListToObjList(raws);

        return persons;
    }

    private static List<Person> parseListToObjList(List<String> raws) throws Exception {
        List<Person> persons = new ArrayList<>();

        for (String raw : raws) {
            String[] splitRaw = raw.split(" ");
            String personName = splitRaw[0];
            int personAge = Integer.parseInt(splitRaw[1]);
            if(personAge < 0) throw new Exception("Некорректный входной файл");
            Person person = new Person(personName, personAge);
            persons.add(person);
        }

        return persons;
    }

    public static void main(String[] args) {
        try {
            List<Person> persons = parseFileToObjList();

            System.out.println(persons);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}