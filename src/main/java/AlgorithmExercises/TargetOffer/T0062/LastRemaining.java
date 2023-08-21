package AlgorithmExercises.TargetOffer.T0062;

import java.util.ArrayList;
import java.util.List;

/**
 * "约瑟夫环"问题
 * <p>
 * 面试题62. 圆圈中最后剩下的数字
 * <p>
 * <p>
 * 0,1,...,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。
 * 求出这个圆圈里剩下的最后一个数字。
 * <p>
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，
 * 则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: n = 5, m = 3
 * 输出: 3
 * 示例 2：
 * <p>
 * 输入: n = 10, m = 17
 * 输出: 2
 *  
 * <p>
 * 限制：
 * <p>
 * 1 <= n <= 10^5
 * 1 <= m <= 10^6
 * <p>
 * 来源：力扣（AlgorithmExercises.LeetCode）
 * 链接：https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author :
 * @version :
 */
public class LastRemaining {

}

/**
 * 超出了时间限制
 * 但是换成了ArrayList就解决了这个问题
 * 原因是LinkedList的remove操作的时间复杂度比较高？
 */
class Solution {
    public int lastRemaining(int n, int m) {
        List<Integer> loop = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            loop.add(i);
        }
        int pointer = 0;
        while (loop.size() > 1) {
            pointer = (pointer + m - 1) % loop.size();
            loop.remove(pointer);
        }
        return loop.get(0);
    }
}


/**
 * 依旧超时
 * 输入：
 * n: 70866
 * m: 116922
 */
class Solution2 {
    public int lastRemaining(int n, int m) {
        int[] arr = new int[n];
        m = m % n;
        int len = n;
        int p = -1;
        while (len > 0) {
            int ticks = m;
            while (ticks > 0) {
                p = (p + 1) == n ? 0 : p + 1;
                if (arr[p] != -1)
                    ticks--;
            }
            arr[p] = -1;
            len--;
        }
        return p;
    }
}

/**
 * "约瑟夫环"问题 反推"安全位置"
 * 数学解法，让时间复杂度降为 O(n)
 */
class Solution3 {
    public int lastRemaining(int n, int m) {
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = (res + m) % i;
        }
        return res;
    }
}
