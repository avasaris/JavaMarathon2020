package day12;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
 */

public class Task2 {

    public static void main(String[] args) {
        List<Integer> evens = new ArrayList<>();

        for(int i = 0; i<=30; i+=2) evens.add(i);
        for(int i = 300; i<=350; i+=2) evens.add(i);

        for(Integer number: evens) System.out.print(number + " ");


    }
}
