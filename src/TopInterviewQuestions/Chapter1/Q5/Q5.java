package TopInterviewQuestions.Chapter1.Q5;

public class Q5 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.superEggDrop(2, 6));
        System.out.println(s.superEggDrop(1, 2));
        System.out.println(s.superEggDrop(3, 14));
        System.out.println(s.superEggDrop(1, 3));
        System.out.println(s.superEggDrop(3, 14));
    }
}

class Solution {
    public int superEggDrop(int K, int N) {
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 2;
        }
        K = K - 1;
        if (K == 1) {
            return N - 1;
        }
        return 1 + superEggDrop(K, N / 2);
    }
}