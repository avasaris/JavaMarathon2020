package day4;

/*
    Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        ArrayTask2 array = new ArrayTask2(100, 0, 10000);

        System.out.println("Наш массив: " + array);
        System.out.println("Наибольший элемент массива: " + array.getMaxElem());
        System.out.println("Наименьший элемент массива: " + array.getMinElem());
        System.out.println("Количество элементов массива, оканчивающихся на '0': " + array.countEnds0());
        System.out.println("Сумма элементов массива, оканчивающихся на '0': " + array.sumEnds0());
    }
}

class ArrayTask2 extends Array {

    ArrayTask2(int n, int low, int hi) {
        super(n, low, hi);
    }

    public int getMaxElem() {
        if (this.length == 0) return 0;
        int max = this.arr[0];
        for (int elem : this.arr)
            if (elem > max) max = elem;
        return max;
    }

    public int getMinElem() {
        if (this.length == 0) return 0;
        int min = this.arr[0];
        for (int elem : this.arr)
            if (elem < min) min = elem;
        return min;
    }

    public long sumEnds0() {
        long sum = 0;
        for (int elem : this.arr)
            if (elem % 10 == 0) sum += elem;
        return sum;
    }

    public long countEnds0() {
        long cnt = 0;
        for (int elem : this.arr)
            if (elem % 10 == 0) cnt++;
        return cnt;
    }
}