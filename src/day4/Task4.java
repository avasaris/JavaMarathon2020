package day4;

/*
    Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой
выведите значение суммы и индекс первого элемента тройки.
 */

public class Task4 {
    public static void main(String[] args) {
        ArrayTask4 array = new ArrayTask4(100, 0, 10000);

        System.out.println("Наш массив: " + array);
        System.out.println("Максимальная тройка - " + array.searchMaxTriplet());
    }

}

class ArrayTask4 extends Array {

    ArrayTask4(int n, int low, int hi) {
        super(n, low, hi);
    }

    public String searchMaxTriplet() {
        int index = 0;
        int max = this.arr[0] + this.arr[1] + this.arr[2];
        for (int i = 0; i <= this.length - 3; i++) {
            int sum = this.arr[i] + this.arr[i + 1] + this.arr[i + 2];
            if (sum > max) {
                max = sum;
                index = i;
            }
        }

        return "индекс: " + index + " сумма: " + max;
    }
}