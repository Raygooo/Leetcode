package LeetCode.Q0415;

/**
 * Class Q0415 is created on 2019/12/4 17:21.
 *
 * @author Ray
 * @version 2019/12/4
 **/

public class Q0415 {
    public static void main(String[] args) {

    }
}


//事实证明StringBuilder的Insert方法很费时间，如果可以的话尽可能用append再接reverse

/**
 * 任何数前面加上多少个0也不会有区别
 * 所以在计算的时候可以考虑这一点
 */
class Solution1 {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder("");

        boolean addToNext = false;
        for (int i = 0; i < (Math.max(num1.length(), num2.length())); i++) {
            int number1 = getNumber(num1, i + 1);
            int number2 = getNumber(num2, i + 1);
            int temp = number1 + number2 + (addToNext ? 1 : 0);
            result.append(temp % 10);
            if (temp/10 > 0)
                addToNext = true;
            else
                addToNext = false;
        }
        if (addToNext)
            result.append(1);
        return result.reverse().toString();
    }

    private int getNumber(String num, int index) {
        int actualIndex = num.length() - index;
        if (actualIndex < 0)
            return 0;
        return (int)num.charAt(actualIndex) - 48;
    }
}




/**
 * from leetcode
 */
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder("");

        int carry = 0;
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;

        while (index1 > -1 || index2 > -1) {
            int number1 = index1 > -1 ? num1.charAt(index1) - '0' : 0;
            int number2 = index2 > -1 ? num2.charAt(index2) - '0' : 0;

            int temp = number1 + number2 + carry;
            int toAdd = temp % 10;
            carry = temp/10;

            result.append(toAdd);

            index1--;
            index2--;
        }

        if (carry > 0)
            result.append(carry);
        return result.reverse().toString();
    }
}
