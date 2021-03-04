package TopInterviewQuestions.Chapter3.Q1;

public class Q1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(s.isPalindrome("0P"));
    }
}

class Solution2 {
    public boolean isPalindrome(String s) {
        char[] scs = s.toLowerCase().toCharArray();
        int ps = 0;
        int pe = s.length() - 1;
        while (ps < pe) {
            if (notCharacter(scs[ps])) {
                ps++;
                continue;
            }
            if (notCharacter(scs[pe])) {
                pe--;
                continue;
            }
            if (scs[ps] != scs[pe])
                return false;
            ps++;
            pe--;
        }
        return true;
    }

    public boolean notCharacter(char c) {
        return (c < '0' || c > '9') && (c < 'a' || c > 'z');
    }
}

/**
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/valid-palindrome/solution/yan-zheng-hui-wen-chuan-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }
}
