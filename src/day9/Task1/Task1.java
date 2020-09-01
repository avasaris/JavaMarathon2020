package day9.Task1;

/**
 * Создайте в методе main() класса Task1 объект класса Студент и объект класса Преподаватель.
 * Выведите в консоль название учебной группы у объекта-студента и название предмета у объекта-преподавателя.
 * Затем, вызовите printInfo() на объектах и посмотрите на результат.
 */

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Vasily", "physics");
        System.out.println("Группа студента: "+student.getGroupName());
        System.out.println(student.printInfo());

        System.out.println();

        Teacher teacher = new Teacher("Gennadi Andreevich", "mathematics");
        System.out.println("Предмет преподавателя: "+teacher.getSubject());
        System.out.println(teacher.printInfo());

    }
}
