package com.ponxu.test.algorithm;

import java.util.Random;

/**
 * Created by xwz on 14/12/1.
 */
public class Utils {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randomIntArray(int len, int max) {
        int[] a = new int[len];

        for (int i = 0; i < len; i++)
            a[i] = new Random().nextInt(max);

        return a;
    }

}
