package LeetCode.Q0125;

import java.util.Stack;

/**
 * Class Q0125 is created on 2019/12/5 0:38.
 *
 * @author Ray
 * @version 2019/12/5
 **/

public class Q0125 {

}
class Solution {
    public boolean isPalindrome(String s) {
        if (s.equals(""))
            return true;

        Stack<Character> half = new Stack<>();
        char[] charArray = s.toCharArray();

        for(char c: charArray) {
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                half.push(c);
            }
        }

        Stack<Character> secondHalf = new Stack<>();

        while(half.size() > secondHalf.size())
            secondHalf.push(half.pop());

        if(half.size() != secondHalf.size())
            secondHalf.pop();

        while(!half.isEmpty()) {
            String a = String.valueOf(half.pop());
            String b = String.valueOf(secondHalf.pop());
            if (!a.equalsIgnoreCase(b))
                return false;
        }
        return true;
    }
}