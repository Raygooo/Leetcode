package AlgorithmExercises.LeetCode.Q0121;

/**
 * Class AlgorithmExercises.LeetCode.Q0121 is created on 2019/12/11 17:49.
 *
 * @author Ray
 * @version 2019/12/11
 **/

public class Q0121 {
}

class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for (int price :
                prices) {
            if (price < buy){
                buy = price;
                sell = price;
            }
            if (price > buy && price - buy > sell - buy)
                sell = price;
        }
        return sell - buy;
    }
}
