package day2;

import java.util.Scanner;

public class Task3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите два целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (++a < b) {
            if ((a % 5 == 0) && (a % 10 != 0)) {
                System.out.print(a + " ");
            }
        }
    }

}
