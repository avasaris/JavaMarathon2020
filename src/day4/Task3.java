package day4;
/*
    Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
*/

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(12, 8, 0, 50);
        System.out.println("Наша матрица: \n" + matrix);

        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + matrix.indexOfMaxRowSum());
    }


}

class Matrix {
    public final int rows;
    public final int cols;
    private final int[][] mtrx;

    Matrix(int r, int c, int low, int hi) {
        this.rows = r;
        this.cols = c;

        this.mtrx = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                this.mtrx[i][j] = genRandomInt(low, hi);
            }
        }
    }

    public String toString() {
        String str = "";

        for (int[] arr : this.mtrx) {
            str += Arrays.toString(arr) + "\t// - сумма " + sumAllElems(arr) + "\n";
        }

        return str.trim();
    }

    public int indexOfMaxRowSum() {
        int index = 0;
        int max = sumInRow(0);
        for (int i = 0; i < this.rows; i++) {
            if(sumInRow(i) >= max) {
                index = i;
                max = sumInRow(i);
            }
        }

        return index;
    }

    private int sumInRow(int r) {
        return sumAllElems(this.mtrx[r]);
    }

    private int sumAllElems(int[] arr) {
        int sum = 0;
        for (int elem : arr) sum += elem;
        return sum;
    }

    private int genRandomInt(int low, int hi) {
        // generate random integer in range [low, hi]
        return (int) (Math.random() * (hi - low + 1) + low);
    }
}
