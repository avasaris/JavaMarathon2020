package day1;

/*
Повторить задание 4, но используя цикл for.
 */

public class Task5 {
    public static void main(String[] args) {
        final int AGE = 18;

        for (int age = AGE; age < 100; age += 5) {
            System.out.println(age);
        }
    }
}
