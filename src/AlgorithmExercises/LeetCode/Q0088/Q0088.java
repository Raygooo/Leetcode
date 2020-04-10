package AlgorithmExercises.LeetCode.Q0088;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Q0088 is created on 2019/12/11 17:36.
 *
 * @author Ray
 * @version 2019/12/11
 **/

public class Q0088 {
    public static void main(String[] args) {

    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < m && pointer2 < n) {
            if (nums1[pointer1] < nums2[pointer2]) {
                res.add(nums1[pointer1++]);
            } else {
                res.add(nums2[pointer2++]);
            }
        }
        if (pointer1 != m) {
            while (pointer1 < m)
                res.add(nums1[pointer1++]);
        } else if (pointer2 != n) {
            while (pointer2 < n)
                res.add(nums2[pointer2++]);
        }

        for (int i = 0; i < res.size(); i++) {
            nums1[i] = res.get(i);
        }
    }
}

class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
