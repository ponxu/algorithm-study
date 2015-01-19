package com.ponxu.test.algorithm;

import java.util.Arrays;

/**
 * Created by xwz on 15-1-19.
 */
public class TestSelectionSort {
    public static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minPos])
                    minPos = j;
            }

            if (minPos != i) {
                int temp = a[i];
                a[i] = a[minPos];
                a[minPos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = Utils.randomIntArray(5, 10);
        System.out.println("I: " + Arrays.toString(a));
        selectionSort(a, a.length);
        System.out.println("O: " + Arrays.toString(a));
    }
}
