package Draft;

import java.util.Arrays;

/**
 * Class Draft.Main2 is created on 2019/12/20 17:09.
 *
 * @author Ray
 * @version 2019/12/20
 **/

public class Draft2 {
    public static void main(String[] args) {
        int[] a = {0,1,0,4,8,2};
        cupSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] k, int low, int high) {
        int left, right, tmpValue;
        if (low >= high)
            return;
        left = low;
        right = high;
        tmpValue = k[low];

        while (left != right) {
            while (tmpValue <= k[right] && left < right)
                right--;

            while (tmpValue >= k[left] && left < right)
                left++;

            if (left < right) {
                int t = k[left];
                k[left] = k[right];
                k[right] = t;
            }
        }
        k[low] = k[left];
        k[left] = tmpValue;
        quickSort(k, low, left - 1);
        quickSort(k, right + 1, high);
    }

    public static void cupSort(int[] k) {
        int[] resultSet = new int[10];
        for (int number : k) {
            resultSet[number]++;
        }
        int index = 0;
        for (int i = 0; i < resultSet.length; i++) {
            for (int j = 0; j < resultSet[i]; j++) {
                k[index++] = i;
            }
        }
    }
}
