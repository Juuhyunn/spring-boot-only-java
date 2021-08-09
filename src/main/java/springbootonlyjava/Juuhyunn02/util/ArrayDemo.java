package springbootonlyjava.Juuhyunn02.util;

import java.util.Arrays;

public class ArrayDemo {
    public int[] fill(int number) {
        int [] ar1 = new int[5];
        Arrays.fill(ar1, number);
        return ar1;
    }
    public int[] copy(int [] arr, int initValue, int start, int length) {
        int [] ar2 = new int[5];
        System.arraycopy(arr, initValue, ar2, start, length);
        return ar2;
    }
    public int[] createIntegerArray(int start, int end) {
        int[] integerArray = new int[Math.abs(end-start)];
        int j = 0;
        for (int i : integerArray) {
            integerArray[j] = start + j;
            j ++ ;
        }
//        for (int i = start; i < end ; i ++) {
//            integerArray[j] = i;
//            j++;
//        }
        return integerArray;
    }
}
