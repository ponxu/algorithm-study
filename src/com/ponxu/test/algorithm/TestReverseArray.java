package com.ponxu.test.algorithm;

import java.util.Arrays;

/**
 * Created by xwz on 14/12/3.
 */
public class TestReverseArray {

    public static void reverse(int[] a) {
        int low = 0, high = a.length - 1;
        for (; low < high; low++, high--) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = Utils.randomIntArray(6, 10);
        System.out.println("I: " + Arrays.toString(a));
        reverse(a);
        System.out.println("O: " + Arrays.toString(a));
    }
}
