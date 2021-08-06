package springbootonlyjava.Juuhyunn02.util;

import java.util.Arrays;

public class ArrayDemo {
    public int[] fill(int number) {
        int [] ar1 = new int[5];
        Arrays.fill(ar1, number);
        return ar1;
    }
    public int[] copy(int [] arr, int initvalue, int start, int length) {
        int [] ar2 = new int[5];
        System.arraycopy(arr, initvalue, ar2, start, length);
        return ar2;
    }
}
