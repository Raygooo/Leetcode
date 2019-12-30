package SelfLearn.Sotring;

import java.util.Arrays;

/**
 * Class BubbleSort is created on 2019/12/19 15:28.
 *
 * @author Ray
 * @version 2019/12/19
 **/


/*
冒泡排序：

    平均 时间复杂度 O(n^2)
    最好 时间复杂度 O(n)
    最坏 时间复杂度 O(n^2)

    空间复杂度 是O(1)

    属于 稳定排序
 */
//
public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] ^= nums[j + 1];
                    nums[j + 1] ^= nums[j];
                    nums[j] ^= nums[j + 1];
                }
            }

        }
    }
}
