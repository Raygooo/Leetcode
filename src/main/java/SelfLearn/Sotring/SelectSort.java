package SelfLearn.Sotring;

/**
 * Class SelectSort is created on 2019/12/19 16:41.
 *
 * @author Ray
 * @version 2019/12/19
 **/

/*
选择排序：
    平均 时间复杂度 O(n^2)
    最好 时间复杂度 O(n^2)
    最坏 时间复杂度 O(n^2)

    空间复杂度 O(1)

    不稳定排序
 */
public class SelectSort {

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;
        }
    }
}
