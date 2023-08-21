package SelfLearn.Sotring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Class QuickSort is created on 2019/12/19 15:52.
 *
 * @author Ray
 * @version 2019/12/19
 **/


/**
 * 快速排序：
 * 平均 时间复杂度 O(n*log2n)
 * 最好 时间复杂度 O(n*log2n)
 * 最差 时间复杂度 O(n^2)
 * <p>
 * 空间复杂度 O(n*log2n)
 * <p>
 * 是不稳定排序
 */
public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {2,4,5,3,6,4,5,7,8,2};
//        quickPractice(arr, 0, 9);
//        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 5, 3, 6, 4, 5, 7, 8, 2));
        quickSort(arr);
        System.out.println(arr);
    }


    public static <E extends Comparable<? super E>> void quickSort(List<E> items) {
        if (items.size() > 1) {
            List<E> smaller = new ArrayList<>();
            List<E> same = new ArrayList<>();
            List<E> larger = new ArrayList<>();

            E chosenItem = items.get(items.size() / 2);
            for (E i : items) {
                if (i.compareTo(chosenItem) < 0)
                    smaller.add(i);
                else if (i.compareTo(chosenItem) > 0)
                    larger.add(i);
                else
                    same.add(i);
            }

            quickSort(smaller);
            quickSort(larger);

            items.clear();
            items.addAll(smaller);
            items.addAll(same);
            items.addAll(larger);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        int left, right, standard;

        if (low >= high)
            return;

        left = low;
        right = high;
        standard = arr[low];

        while (left != right) {
            while (standard <= arr[right] && left < right)
                right--;

            while (standard >= arr[left] && left < right)
                left++;

            if (left < right) {
                int t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
            }
        }

        //left == right
        arr[low] = arr[left];
        arr[left] = standard;
        quickSort(arr, low, left - 1);
        quickSort(arr, right + 1, high);
    }

}
