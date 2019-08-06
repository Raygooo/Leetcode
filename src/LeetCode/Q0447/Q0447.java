package LeetCode.Q0447;

import java.util.Date;
import java.util.HashMap;

/**
 * Class Q0447 is created on 06/08/2019 20:27.
 *
 * @author Ray
 * @version 06/08/2019
 **/

public class Q0447 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        HashMap<Integer, Integer> map = new HashMap<>();

    }
}

/**
 * from leetcode
 * Didn't understand the question...
 */
class Solution {
    public int numberOfBoomerangs(int[][] points) {

        if (points == null || points.length == 0 || points[0].length == 0) {
            return 0;
        }

        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            hashMap.clear();
            for (int j = 0; j < points.length; j++) {
                int distance = (points[j][0] - points[i][0]) * (points[j][0] - points[i][0]) +
                        (points[j][1] - points[i][1]) * (points[j][1] - points[i][1]);
                count += hashMap.getOrDefault(distance, 0) * 2;
                hashMap.put(distance, hashMap.getOrDefault(distance, 0) + 1);
            }
        }
        return count;
    }
}
