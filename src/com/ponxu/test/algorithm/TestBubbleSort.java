package com.ponxu.test.algorithm;

import java.util.Arrays;

/**
 * Created by xwz on 15/1/18.
 */
public class TestBubbleSort {
    public static void bubbleSort(int[] a, int n) {
        for (int p = n - 1; p >= 0; p--) {
            boolean sorted = true;
            for (int i = 0; i < p; i++) {
                if (a[i] > a[i + 1]) {
                    Utils.swap(a, i, i + 1);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }

    public static void main(String[] args) {
        int[] a = Utils.randomIntArray(5, 10);
        System.out.println("I: " + Arrays.toString(a));
        bubbleSort(a, a.length);
        System.out.println("O: " + Arrays.toString(a));
    }
}
