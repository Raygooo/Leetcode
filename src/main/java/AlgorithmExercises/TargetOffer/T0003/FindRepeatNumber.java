package AlgorithmExercises.TargetOffer.T0003;

import java.util.HashSet;
import java.util.Set;

/**
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 *      [2, 3, 1, 0, 2, 5, 3]
 * 输出：
 *      2 或 3
 *
 *
 * 限制：
 *
 * 2 <= n <= 100000
 *
 * @author :
 * @version :
 */
public class FindRepeatNumber {

}

/**
 * 这种解法不是最优解，因为题目中的限制更多一点那就是 数字的范围在0~n-1之间, 其中n是数组的长度
 */
class Solution {
    public int findRepeatNumber(int[] nums) {
        int oneOfTheResult = -1;
        Set<Integer> numSet = new HashSet<>();
        for (int num: nums) {
            if(numSet.contains(num)){
                oneOfTheResult = num;
                break;
            }
            numSet.add(num);
        }
        return oneOfTheResult;
    }
}

/**
 * 更加优化的解法
 * 既没有用额外的内存空间
 * 也减少了多余的对比
 * 思路就是把对应的数字换到相应下标的位置上，如果相应的位置已经有了对应的数字说明数字重复了
 */
class Solution2 {
    public int findRepeatNumber(int[] nums) {
        int oneOfTheResult = -1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i){
                int tmp = nums[i];
                if (nums[tmp] == tmp){
                    oneOfTheResult = tmp;
                    break;
                }
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return oneOfTheResult;
    }
}
