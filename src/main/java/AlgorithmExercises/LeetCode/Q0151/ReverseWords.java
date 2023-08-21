package AlgorithmExercises.LeetCode.Q0151;

import java.util.Arrays;

/**
 * Class ReverseWords is created on 2020/4/10 22:05.
 *
 * @author Ray
 * @version 2020/4/10
 **/

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  hello        world!    ";

        String[] ss = s.split(" ");
        System.out.println(ss.length);
        System.out.println(Arrays.deepToString(ss));
    }
}

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int index = words.length - i - 1;
            if (!words[index].equals("")) {
                strBuilder.append(words[index]);
                strBuilder.append(" ");
            }
        }
        if (strBuilder.length() > 0)
            strBuilder.deleteCharAt(strBuilder.length() - 1);
        return strBuilder.toString();
    }
}
