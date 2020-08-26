package day3;

/*
Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
Программа должна работать до тех пор, пока не будет введено слово “Stop”.
Реализовать, используя следующие данные: Москва, Владивосток, Ростов - Россия.
Рим, Милан, Турин - Италия. Ливерпуль, Манчестер, Лондон - Англия.
Берлин, Мюнхен, Кёльн - Германия. При вводе любого другого города вывести сообщение “Неизвестная страна”.
 */

import java.util.Scanner;

public class Task1 {
    private static final Scanner stream = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Для завершения программы введите слово \"Stop\"");

        while (true) {

            System.out.print("Ведите название города: ");

            String city = stream.nextLine();
            city = city.trim();

            if (city.equalsIgnoreCase("Stop") || city.equalsIgnoreCase("Стоп")) break;

            String country;

            switch (city.toLowerCase()) {
                case "москва":
                case "владивосток":
                case "ростов":
                    country = "Россия";
                    break;
                case "рим":
                case "милан":
                case "турин":
                    country = "Италия";
                    break;
                case "ливерпуль":
                case "манчестер":
                case "лондон":
                    country = "Англия";
                    break;
                case "берлин":
                case "мюнхен":
                case "кёльн":
                case "кельн":
                    country = "Германия";
                    break;
                default:
                    country = "Неизвестная страна";
            }

            System.out.println("Страна: " + country);

        }
    }
}
