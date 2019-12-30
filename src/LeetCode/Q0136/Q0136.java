package LeetCode.Q0136;

import java.util.HashSet;

/**
 * Class Q0136 is created on 2019/12/23 11:58.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class Q0136 {
}

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num :
                nums) {
            if (hashSet.contains(num))
                hashSet.remove(num);
            else
                hashSet.add(num);
        }
        return hashSet.iterator().next();
    }
}