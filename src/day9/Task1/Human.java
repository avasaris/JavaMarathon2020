package day9.Task1;

/*
 * Создайте класс Человек (англ. Human). У человека должно быть поле “имя” (англ. name).
 * На это поле в классе должен быть конструктор, геттер и сеттер. Также, у Человека должен
 * быть метод printInfo(), который выводит в консоль информацию о человеке в формате: “Этот человек с именем ИМЯ”.
 */

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Этот человек с именем " + name;
    }

    public String printInfo() {

        return "direct -> " + toString()
                + "\n"
                + "super -> " + super.toString()
                + "\n"
                + "this -> " + this.toString();
    }
}
