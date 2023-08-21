package AlgorithmExercises.LeetCode.Q1111;

/**
 * Class MaxDepthAfterSplit is created on 2020/4/1 20:45.
 *
 * Q1111
 *
 * 给你一个合法的括号序列，
 * 你需要将其拆分成两个合法的子序列（不连续），
 * 使得两个子序列的括号嵌套深度较大者尽量的小。
 *
 * @author Ray
 * @version 2020/4/1
 **/

public class MaxDepthAfterSplit {

}

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        char[] seqChars = seq.toCharArray();
        int[] ans = new int[seq.length()];
        for (int i = 0; i < seqChars.length; i++) {
            if (seqChars[i] == '('){
                ans[i] = i % 2;
            }else {
                ans[i] = 1 - i % 2;
            }
        }
        return ans;
    }
}
