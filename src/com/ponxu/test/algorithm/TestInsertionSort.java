package com.ponxu.test.algorithm;

import java.util.Arrays;

/**
 * Created by xwz on 14/12/1.
 */
public class TestInsertionSort {

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            for (; j >= 0 && key < a[j]; j--) // asc
                a[j + 1] = a[j];
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = Utils.randomIntArray(5, 10);
        System.out.println("I: " + Arrays.toString(a));
        insertionSort(a);
        System.out.println("O: " + Arrays.toString(a));
    }
}
