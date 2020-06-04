package AlgorithmExercises.LeetCode.Q0014;

/**
 * @author :
 * @version :
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("aaa".substring(0, 2));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int common = 0;
        boolean p = true;
        while (p) {
            if (strs[0].length() <= common)
                break;
            char c = strs[0].charAt(common);
            for (int i = 0; i < strs.length; i++) {
                if (common >= strs[i].length() || c != strs[i].charAt(common)) {
                    p = false;
                    common--;
                    break;
                }
            }
            common++;
        }
        return strs[0].substring(0, common);
    }
}