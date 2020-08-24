package day1;

/*
Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
Вывод в консоль должен быть таким:
JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */

public class Task1 {
    public static void main(String[] args) {
        final int MAX_LOOPS = 10;

        int counter = MAX_LOOPS;

        while (counter-- > 0) {
            System.out.print("JAVA ");
        }
    }
}
