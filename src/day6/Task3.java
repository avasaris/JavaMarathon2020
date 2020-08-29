package day6;

/**
 * Создать класс "Преподаватель", имеющий поля “ФИО”, “Предмет”. Создать класс "Студент" с полем “ФИО”.
 * Каждый класс имеет конструктор (с параметрами), все set и get методы, а также у преподавателя есть
 * метод "оценить студента" принимающий в параметры студента, и работающий следующим образом:
 * генерируется случайное число от 2 до 5, выводится строка: "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента
 * с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА." Все слова, написанные большими буквами,
 * должны быть заменены соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”, "хорошо”,
 * "удовлетворительно" или "неудовлетворительно", в зависимости от значения случайного числа.
 * Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента, передав студента
 * в качестве аргумента метода.
 */

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Занудный Денис Валентинович", "Астрономия");
        Student student = new Student("Раздолбай Иван Макарович");

        System.out.println(teacher.getGradeFor(student));
    }


}

class Human {
    private String fio;

    public Human(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}

class Student extends Human {
    public Student(String fio) {
        super(fio);
    }
}

class Teacher extends Human {
    private String subject;

    public Teacher(String fio, String subject) {
        super(fio);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGradeFor(Student student) {
        return "Преподаватель " + getFio()
                + " оценил студента с именем " + student.getFio()
                + " по предмету " + getSubject()
                + " на оценку " + Marks.getRandomMark();
    }
}

class Marks {
    private static final String[] marks = {"неудовлетворительно", "удовлетворительно", "хорошо", "отлично"};

    public static String getRandomMark() {
        int randomMark = genRandomInt(0, marks.length - 1);
        return marks[randomMark];
    }

    private static int genRandomInt(int low, int hi) {
        // generate random integer in range [low, hi]
        return (int) (Math.random() * (hi - low + 1) + low);
    }
}