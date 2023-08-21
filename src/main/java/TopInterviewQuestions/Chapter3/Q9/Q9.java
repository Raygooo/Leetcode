package TopInterviewQuestions.Chapter3.Q9;

public class Q9 {
}

class Solution {
    public void reverseString(char[] s) {
        int p1 = 0;
        int p2 = s.length - 1;
        while (p1 < p2) {
            s[p1] ^= s[p2];
            s[p2] ^= s[p1];
            s[p1] ^= s[p2];
            p1++;
            p2--;
        }
    }
}