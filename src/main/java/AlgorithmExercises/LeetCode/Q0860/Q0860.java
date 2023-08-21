package AlgorithmExercises.LeetCode.Q0860;

import java.util.HashMap;

/**
 * Class Q0860 is created on 06/08/2019 19:41.
 *
 * @author Ray
 * @version 06/08/2019
 **/

public class Q0860 {

    public static void main(String[] args) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(5,0);
//        map.put(5,map.get(5)+2);
//
//        System.out.println(map.get(5));


    }

}

/**
 * my submission 17ms
 *
 *  这个答案提醒我我可能有些部分过于依赖java的数据结构，但对于特定问题，应该有特定的简化的解决方案。
 *  对于简单问题，非扩展性问题，基本上都有简单的解
 */
class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> cash = new HashMap<>();
        cash.put(5, 0);
        cash.put(10, 0);
        cash.put(20, 0);


        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                cash.put(5, cash.get(5) + 1);
            } else if (bills[i] == 10) {
                cash.put(10, cash.get(10) + 1);
                if (cash.get(5) > 0) {
                    cash.put(5, cash.get(5) - 1);
                } else
                    return false;
            } else if (bills[i] == 20) {
                cash.put(20, cash.get(20) + 1);
                if (cash.get(5) > 0 && cash.get(10) > 0) {
                    cash.put(5, cash.get(5) - 1);
                    cash.put(10, cash.get(10) - 1);
                } else if (cash.get(5) > 2) {
                    cash.put(5, cash.get(5) - 3);
                } else return false;
            }
        }
        return true;
    }
}

/**
 * from leetcode 1ms submission
 * This submission did not use HashMap but two integer to count the amount of five and ten of cash
 * so it only has operation that belong to add or subtract, so it is efficient
 *
 */
class Solution2 {
    public boolean lemonadeChange(int[] bills) {
        int countOfFive=0;
        int countOfTen=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i] == 5)
                countOfFive++;
            else if(bills[i]==10 && countOfFive>=1)
            {
                countOfFive--;
                countOfTen++;
                continue;
            }
            else if(bills[i]==20 && (countOfFive>=3 || (countOfFive>=1 && countOfTen>=1)))
            {
                if(countOfFive>=1 && countOfTen>=1)
                {
                    countOfFive--;
                    countOfTen--;
                    continue;
                }
                else if(countOfFive>=3)
                {
                    countOfFive=countOfFive-3;
                    continue;
                }
            }
            else
                return false;
        }
        return true;
    }
}