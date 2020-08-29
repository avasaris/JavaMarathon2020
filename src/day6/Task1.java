package day6;

/*
    В классах Автомобиль и Мотоцикл из прошлого дня реализовать два метода:
    первый метод - выводит в консоль строку “Это Автомобиль” (или “Это мотоцикл”)
    второй метод - принимает на вход число (год), и возвращает разницу между
    переданным годом и годом выпуска транспортного средства
*/

public class Task1 {

    private static final int YEAR = 2020;  // <--  Задайте год для вычиления разницы

    public static void main(String[] args) {
        Transport car = new Car();

        car.setColor("Red");
        car.setModel("Lada");
        car.setYear(1990);

        car.printType();

        System.out.println("Модель: " + car.getModel());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Год выпуска: " + car.getYear());

        System.out.println("Разница с " + YEAR + " годом составляет: " + car.yearsDiff(YEAR));



        Transport bike = new Bike("Ural", "Blue", 2010);

        bike.printType();

        System.out.println("Модель: " + bike.getModel());
        System.out.println("Цвет: " + bike.getColor());
        System.out.println("Год выпуска: " + bike.getYear());

        System.out.println("Разница с " + YEAR + " годом составляет: " + bike.yearsDiff(YEAR));

    }

}
