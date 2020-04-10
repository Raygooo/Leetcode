package AlgorithmExercises.LeetCode.Q0005;

/**
 * @author :
 * @version :
 */
public class LongestPalindrome {
}

class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();

        String max = "";

        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(chars[i]);
            for (int j = 1; j <= i && i + j < len; j++) {
                if (chars[i - j] == chars[i + j]) {
                    sb.append(chars[i - j]);
                    sb.insert(0, chars[i - j]);
                }else break;
            }
            if (sb.length() > max.length())
                max = sb.toString();
        }

        for (int i = 0; i + 1 < len; i++) {
            StringBuilder sb = new StringBuilder();
            if (chars[i] == chars[i + 1]) {
                sb.append(chars[i]);
                sb.append(chars[i + 1]);

                for (int j = 1; j <= i && i + j + 1 < len; j++) {
                    if (chars[i - j] == chars[i + j + 1]){
                        sb.append(chars[i + j + 1]);
                        sb.insert(0,chars[i - j]);
                    }else break;
                }
                if (sb.length() > max.length())
                    max = sb.toString();
            }
        }

        return max;
    }

}
