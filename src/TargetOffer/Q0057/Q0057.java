package TargetOffer.Q0057;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class Q0057 is created on 2020/3/6 21:06.
 *
 * @author Ray
 * @version 2020/3/6
 **/

public class Q0057 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.deepToString(s.findContinuousSequence(9)));
    }
}

class Solution {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        int upLimit = target / 2 + 2;

        for (int i = 1; i < upLimit; i++) {
            int sum = 0;
            tmp.clear();
            for (int j = i; j <= upLimit; j++) {
                if (sum > target)
                    break;
                else if (sum < target) {
                    sum += j;
                    tmp.add(j);
                } else {
                    resultList.add(new ArrayList<>(tmp));
                    break;
                }
            }
        }

        int len = resultList.size();
        int[][] result = new int[len][];
        for (int i = 0; i < len; i++) {
            List<Integer> tmpArrayList = resultList.get(i);
            int size = tmpArrayList.size();
            int[] tmpInts = new int[size];
            for (int j = 0; j < size; j++) {
                tmpInts[j] = tmpArrayList.get(j);
            }
            result[i] = tmpInts;
        }
        return result;
    }
}

class Solution2 {
    public int[][] findContinuousSequence(int target) {
        int low = 1, high = 2;
        int sum = low + high;
        List<int[]> resultList = new ArrayList<>();
        while (low < high && high <= target / 2 + 2) {
            if (sum < target) {
                high++;
                sum += high;
            } else if (sum > target) {
                sum -= low;
                low++;
            } else {
                int[] tmp = new int[high - low + 1];
                for (int i = 0, j = low; i < high - low + 1; i++, j++) {
                    tmp[i] = j;
                }
                resultList.add(tmp);
                sum-=low;
                low++;
            }
        }

        return resultList.toArray(new int[0][]);
    }
}
