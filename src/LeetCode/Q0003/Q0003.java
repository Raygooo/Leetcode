package LeetCode.Q0003;

import java.util.*;

/**
 * Class Q0003 is created on 2019/12/26 12:23.
 *
 * @author Ray
 * @version 2019/12/26
 **/

public class Q0003 {
    public static void main(final String[] args) {
        final Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}

class Solution {
    public int lengthOfLongestSubstring(final String s) {
        int max = 0;
        ArrayList<Character> arrayList = new ArrayList<>();
        final char[] chars = s.toCharArray();
        for (final char c : chars) {
            if (arrayList.contains(c)) {
                if (arrayList.size() > max)
                    max = arrayList.size();
                arrayList = new ArrayList<>(arrayList.subList(arrayList.indexOf(c) + 1, arrayList.size() - 1));
            }
            arrayList.add(c);
        }
        if (arrayList.size() > max)
            max = arrayList.size();
        return max;
    }

}

class Solution2 {
    public int lengthOfLongestSubstring(final String s) {
        final int len = s.length();
        int max = 0, i = 0, j = 0;
        final Set<Character> hashSet = new HashSet<>();
        while (i < len && j < len) {
            if (!hashSet.contains(s.charAt(j))) {
                max = Math.max(max, j - i);
                hashSet.add(s.charAt(j++));
            } else {
                hashSet.remove(s.charAt(i++));
            }
        }
        return max;
    }
}

class Solution3 {
    public int lengthOfLongestSubstring(final String s) {
        final int len = s.length();
        int max = 0, i = 0, j = 0;
        final Map<Character, Integer> hashMap = new HashMap<>();
        while (j < len) {
            if (hashMap.containsKey(s.charAt(j)))
                i = Math.max(hashMap.get(s.charAt(j)), i);
            hashMap.put(s.charAt(j++), j);
            max = Math.max(max, j - i);
        }
        return max;
    }
}