package day6;

/**
 * Создать класс Самолет с полями “изготовитель”, “год выпуска”, “длина”, “вес”, “объем топлива в баке”.
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
 * (значение поля “объем топлива в баке” установить равным 0). В конструкторе для передачи полям значений
 * использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(), который
 * выводит сообщение в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., объем топлива в баке: …”
 * Также, необходимо реализовать метод fillUp(), который в качестве аргумента принимает число и заправляет
 * топливный бак самолета на это значение.
 */

public class Plane {
    private final String producer;
    private int year;
    private int length;
    private int weight;
    private int fuelLevel;

    public Plane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String info() {
        return "Изготовитель: " + producer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", объем топлива в баке: " + fuelLevel;
    }

    public void fillUp(int amount) {
        setFuelLevel(getFuelLevel() + amount);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}
