package day18;

/*
 * Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве
 * не используя циклы (необходимо использовать рекурсивные вызовы).
 *
 * Пример:
 * int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
 * System.out.println(someMethod(...)); // 65346
 *
 * *Вместо someMethod(...) должен быть ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(arrSum(numbers));
    }

    private static int arrSum(int[] arr) {
        if(arr.length == 0) return 0;
        return arr[0] + arrSum(Arrays.copyOfRange(arr,1,arr.length));
    }
}
