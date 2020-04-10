package AlgorithmExercises.LeetCode.Q0067;

/**
 * Class Q0067 is created on 2019/12/4 21:51.
 *
 * @author Ray
 * @version 2019/12/4
 **/

public class Q0067 {
}

class Solution1 {
    public String addBinary(String a, String b) {
        int index1 = a.length() - 1;
        int index2 = b.length() - 1;

        int carry = 0;

        StringBuilder result = new StringBuilder();
        while(index1 > -1 || index2 > -1) {
            int number1 = index1 > -1 ? a.charAt(index1) - '0' : 0;
            int number2 = index2 > -1 ? b.charAt(index2) - '0' : 0;

            int temp = number1 + number2 + carry;

            if (temp > 1)
                carry = 1;
            else
                carry = 0;

            if (temp == 0 || temp == 2)
                result.append(0);
            else
                result.append(1);

            index1--;
            index2--;
        }
        if (carry > 0)
            result.append(carry);

        return result.reverse().toString();
    }
}


