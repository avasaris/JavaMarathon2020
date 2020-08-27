package day4;

import java.util.Arrays;

public class Array {
    protected final int[] arr;

    public final int length;

    Array(int n, int low, int hi) {
        this.length = n;

        this.arr = new int[n];
        for (int i = 0; i < n; i++) this.arr[i] = genRandomInt(low, hi);
    }

    private int genRandomInt(int low, int hi) {
        // generate random integer in range [low, hi]
        return (int) (Math.random() * (hi - low + 1) + low);
    }

    public String toString() {
        return Arrays.toString(this.arr);
    }
}
