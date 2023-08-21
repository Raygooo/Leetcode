package AlgorithmExercises.TargetOffer.T0058;

/**
 * Class ReverseLeftWords is created on 2020/4/10 22:40.
 *
 * @author Ray
 * @version 2020/4/10
 **/

public class ReverseLeftWords {
}

class Solution {
    public String reverseLeftWords(String s, int n) {
        int k = n % s.length();
        if (k == 0)
            return s;

        StringBuilder strBuilder = new StringBuilder(s);

        strBuilder.append(s);

        return strBuilder.substring(k, k + s.length());
    }
}