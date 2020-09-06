package day12;

/*
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Распечатать список.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("LIAZ");
        cars.add("KAMAZ");
        Collections.addAll(cars, "BELAZ", "ZAZ", "UAZ");

        cars.add(3, "MAZ");

        cars.remove(0);

        for (String car : cars) System.out.println(car);

    }
}
