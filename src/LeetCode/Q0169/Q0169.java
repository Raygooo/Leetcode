package LeetCode.Q0169;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Class Q0169 is created on 2019/12/23 12:10.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class Q0169 {
}

class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num :
                nums) {
            if (hashMap.containsKey(num)) {
                int count = hashMap.get(num) + 1;
                if (count > nums.length / 2)
                    return num;
                hashMap.put(num, count);
            } else
                hashMap.put(num, 1);
        }
        return 0;
    }
}


class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
