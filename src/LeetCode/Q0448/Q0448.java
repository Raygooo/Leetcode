package LeetCode.Q0448;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Class Q0448 is created on 2020/3/3 18:57.
 *
 * @author Ray
 * @version 2020/3/3
 **/

public class Q0448 {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int number :
                nums) {
            numSet.add(number);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < nums.length + 1; i++) {
            if (!numSet.contains(i))
                result.add(i);
        }
        return result;
    }
}


class Solution2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] *= -1;
        }
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        return result;
    }
}


class Solution3 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[nums[i] - 1]++;
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (result[i] == 0)
                resultList.add(i + 1);
        }
        return resultList;
    }
}