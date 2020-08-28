package day5;

/*
    Создать класс Автомобиль, с полями “Год выпуска”, “Цвет”, “Модель”.
    Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль,
    задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
    Созданный вами класс должен отвечать принципам инкапсуляции.
*/

public class Task1 {
    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.setColor("Red");
        auto.setModel("Lada");
        auto.setYear(1990);

        System.out.println("Модель: " + auto.getModel());
        System.out.println("Цвет: " + auto.getColor());
        System.out.println("Год выпуска: " + auto.getYear());
    }

}

class Auto {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
