package LeetCode.Q0387;

import java.util.Date;

/**
 * Class Q0387 is created on 06/08/2019 20:08.
 *
 * @author Ray
 * @version 06/08/2019
 **/

public class Q0387 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.toString());
    }
}

/**
 * Finished Time: 20:24:05
 * Time used: 16min
 *
 * 97.41
 * 99.35
 *
 */
class Solution {
    public int firstUniqChar(String s) {
        char[] sc = s.toCharArray();
        int[] count = new int[26];

        for (char c :
                sc) {
            count[((int) c) - 97] += 1;
        }

        for (int i = 0; i < sc.length; i++) {
            if (count[((int) sc[i]) - 97] == 1) {
                return i;
            }
        }
        return -1;
    }
}
