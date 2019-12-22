package SelfLearn.Sotring;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Class Sort is created on 2019/12/19 16:20.
 *
 * @author Ray
 * @version 2019/12/19
 **/

public class Sort {

    public static void main(String[] args) {
        int[] a = {5, 3, 4, 2, 1, 7, 9};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
    }
    public static <E extends Comparable<? super E>> void swap(E[] a, int i, int j) {
        E tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
