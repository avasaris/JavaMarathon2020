package day1;

/*
Вывести на экран слово “JAVA”, в столбик, чтобы оно повторилось 10 раз, используя цикл на ваше усмотрение (for или while).
 */

public class Task3 {
    public static void main(String[] args) {
        final int MAX_LOOPS = 10;

        int counter = MAX_LOOPS;

        while (counter-- > 0) {
            System.out.println("JAVA");
        }

    }
}
