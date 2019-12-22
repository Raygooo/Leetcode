package SelfLearn.Sotring;

import java.util.HashMap;

/**
 * Class insertionSort is created on 2019/12/10 20:30.
 *
 * @author Ray
 * @version 2019/12/10
 **/


/*
插入排序：

    平均 时间复杂度 O(n^2)
    最好 时间复杂度 O(n)
    最坏 时间复杂度 O(n^2)

    空间复杂度 O(1)

    是稳定排序
 */
public class InsertionSort {

    void insertionSort(int[] a) {
        int j;

        for (int p = 1; p < a.length; p++) {
            int tmp = a[p];

            for (j = p; j > 0 && tmp - a[j - 1] < 0; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }

    public static <E extends Comparable<? super E>> void insertionSort2(E[] items) {

        for (int i = 0; i < items.length; i++) {
            E tmp = items[i];
            int j;
            for (j = i; j > 0 && tmp.compareTo(items[j]) < 0; j--) {
                items[j] = items[j - 1];
            }
            items[j] = tmp;

        }
    }

}

