package AlgorithmExercises.LeetCode.Q0028;

/**
 * @author :
 * @version :
 */
public class StrStr {
}

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == needle.length() && haystack.equals(needle))
            return 0;

        int len = needle.length();

        for (int i = 0; i <= haystack.length() - len; i++) {
            if (haystack.substring(i,i+len).equals(needle))
                return i;
        }
        return -1;
    }
}