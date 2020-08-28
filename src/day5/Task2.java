package day5;

/*
    Создать класс Мотоцикл, с  полями “Год выпуска”, “Цвет”, “Модель”. Создать экземпляр класса Мотоцикл,
    с помощью конструктора (сеттеры не использовать). Придерживаться принципов инкапсуляции и использовать
    ключевое слово this.
*/

public class Task2 {
    public static void main(String[] args) {
        Motorcycle moto1 = new Motorcycle("Ural", "Blue", 2010);

        System.out.println("Модель: " + moto1.getModel());
        System.out.println("Цвет: " + moto1.getColor());
        System.out.println("Год выпуска: " + moto1.getYear());

    }
}

class Motorcycle {
    private final String model;
    private final String color;
    private final int year;

    Motorcycle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}