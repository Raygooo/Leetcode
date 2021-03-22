package TopInterviewQuestions.Chapter3.Q8;

public class Q8 {
}


class Solution {
    public int firstUniqChar(String s) {
        int p = 0;
        int mark = 0;
        while (p < s.length()) {
            if (s.charAt(p) == s.charAt(mark)) {
                mark++;
                p = mark;
            }

        }
        return -1;
    }
}