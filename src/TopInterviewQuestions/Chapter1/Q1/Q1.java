package TopInterviewQuestions.Chapter1.Q1;

public class Q1 {
    public static void main(String[] args) {

    }
}


/**
 * 异或运算
 * <p>
 * 运算法则：
 * <p>
 * 1. 归零律： a ^ a = 0
 * <p>
 * 2. 恒等律： a ^ 0 = a
 * <p>
 * 3. 交换律： a ^ b = b ^ a
 * <p>
 * 4. 结合律： a ^ b ^ c = a ^ (b ^ c) = (a ^ b) ^ c
 * <p>
 * <p>
 * 推导出的性质
 * <p>
 * 1. 自反： a ^ b ^ a = b
 * <p>
 * 可由定律1. 2. 3.推导
 * <p>
 * 2. d = a ^ b ^ c  ->  a = d ^ b ^ c
 * <p>
 * 详细过程：
 * <p>
 * -> d ^ d = a ^ b ^ c ^ d
 * <p>
 * -> 0 = a ^ b ^ c ^ d
 * <p>
 * -> 0 ^ a = a ^ b ^ c ^ d
 * <p>
 * -> a = b ^ c ^ d
 * <p>
 * -> a = d ^ b ^ c
 * <p>
 * 3. 二进制中，只有不同位异或才为1，相同位异或都为0
 */
class Solution1 {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int j : nums) {
            num ^= j;
        }
        return num;
    }
}
