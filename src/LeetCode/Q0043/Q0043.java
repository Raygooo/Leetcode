package LeetCode.Q0043;

import java.util.LinkedList;

/**
 * Class Q0043 is created on 2019/12/4 19:53.
 *
 * @author Ray
 * @version 2019/12/4
 **/

public class Q0043 {


}

/**
 * 简单的竖式乘法的思想
 */
class Solution1 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        LinkedList<StringBuilder> middleResult = new LinkedList<>();

        for (int i = num1.length() - 1; i > -1; i--) {
            int carry = 0;
            int number1 = num1.charAt(i) - '0';
            StringBuilder middle = new StringBuilder("");

            for (int j = num2.length() - 1; j > -1; j--) {
                int number2 = num2.charAt(j) - '0';

                int temp = number1 * number2 + carry;

                int toAdd = temp % 10;
                carry = temp / 10;

                middle.append(toAdd);
            }

            if (carry > 0)
                middle.append(carry);

            middle.reverse();

            for (int j = 0; j < num1.length() - i - 1; j++)
                middle.append(0);

            middleResult.add(middle);
        }

        return sum(middleResult);
    }

    private String sum(LinkedList<StringBuilder> list) {
        if (list.size() == 1)
            return list.get(0).toString();

        StringBuilder num1 = list.removeFirst();
        StringBuilder num2 = list.removeFirst();

        StringBuilder result = new StringBuilder("");

        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;

        int carry = 0;

        while (index1 > -1 || index2 > -1) {
            int number1 = index1 > -1 ? num1.charAt(index1) - '0' : 0;
            int number2 = index2 > -1 ? num2.charAt(index2) - '0' : 0;

            int temp = number1 + number2 + carry;
            int toAdd = temp % 10;
            carry = temp / 10;

            result.append(toAdd);

            index1--;
            index2--;
        }

        if (carry > 0)
            result.append(carry);

        list.addFirst(result.reverse());
        return sum(list);
    }
}


/**
 * from leetcode
 * 利用了数字空间
 * https://leetcode-cn.com/problems/multiply-strings/solution/you-hua-ban-shu-shi-da-bai-994-by-breezean/
 */
class Solution2 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] res = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i > -1; i--) {
            int number1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j > -1; j--) {
                int number2 = num2.charAt(j) - '0';
                int temp = number1 * number2 + res[i + j + 1];
                res[i + j + 1] = temp % 10;
                res[i + j] += temp / 10;
            }
        }

        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < res.length; i++) {
            if (i==0 && res[i] == 0)
                continue;
            result.append(res[i]);
        }
        return result.toString();
    }
}

