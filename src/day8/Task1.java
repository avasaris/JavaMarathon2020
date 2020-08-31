package day8;

/*
 * Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная конкатенацией
 * (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 * После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу
 * все числа из диапазона: 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
 *
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String)
 * и использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
 */

public class Task1 {
    public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) {
            System.out.println("\nExperiment #" + j);

            // ====== String ====================================

            long start = System.currentTimeMillis();

            String str = "";

            for (int i = 0; i <= 20000; i++) str += i + " ";

            long finish = System.currentTimeMillis();
            long timeConsumedMillis = finish - start;

            System.out.println("String concatenation took: " + timeConsumedMillis + " ms.");

            // ====== StringBuilder ====================================

            start = System.currentTimeMillis();

            StringBuilder strBldr = new StringBuilder();

            for (int i = 0; i <= 20000; i++) strBldr.append(i).append(' ');

            finish = System.currentTimeMillis();
            timeConsumedMillis = finish - start;

            System.out.println("StringBuilder append took: " + timeConsumedMillis + " ms.");

        }

    }

}
