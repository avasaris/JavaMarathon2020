package day4;

/*
    С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль,
а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

 */

import java.util.Scanner;

public class Task1 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        ArrayTask1 array = new ArrayTask1(n, 0, 10);

        System.out.println("Наш массив: " + array);
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + array.countGt8());
        System.out.println("Количество чисел равных 1: " + array.countEq1());
        System.out.println("Количество четных чисел: " + array.countEvens());
        System.out.println("Количество нечетных чисел: " + array.countOdds());
        System.out.println("Сумма всех элементов массива: " + array.sumAllElems());

    }
}

class ArrayTask1 extends Array {

    ArrayTask1(int n, int low, int hi) {
        super(n, low, hi);
    }

    public int countOdds() {
        int cnt = 0;
        for (int elem : this.arr) cnt += elem % 2;
        return cnt;
    }

    public int countEvens() {
        return this.length - this.countOdds();
    }

    public long sumAllElems() {
        long sum = 0;
        for (int elem : this.arr) sum += elem;
        return sum;
    }

    public int countGt8() {
        int cnt = 0;
        for (int elem : this.arr) {
            if (elem > 8) cnt++;
        }
        return cnt;
    }

    public int countEq1() {
        int cnt = 0;
        for (int elem : this.arr) {
            if (elem == 1) cnt++;
        }
        return cnt;
    }
}

