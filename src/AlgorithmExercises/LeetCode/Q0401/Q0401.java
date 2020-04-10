package AlgorithmExercises.LeetCode.Q0401;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class Q0401 is created on 2020/2/1 12:18.
 *
 * @author Ray
 * @version 2020/2/1
 **/

public class Q0401 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.readBinaryWatch(1));
    }
}

class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();

        if (num > 10)
            return res;

        ArrayList<Integer> com = new ArrayList<>();

        int[] time = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        computeCombinations(res, time, 0, num, com);

        return res;
    }

    void computeCombinations(List<String> list, int[] nums, int start, int num, ArrayList<Integer> combination) {
//        list.add("something");
        if (num == 0) {
            int hour = 0, min = 0;
            for (Integer i :
                    combination) {
                if (i < 4)
                    hour += Math.pow(2, i);
                else
                    min += Math.pow(2, i - 4);
            }
            if (hour < 12 && min < 60)
                list.add(String.format("%d:%02d", hour, min));
            return;
        }
        if (start == nums.length) {
            return;
        }
        combination.add(nums[start]);
        computeCombinations(list, nums, start + 1, num - 1, combination);
        combination.remove(combination.size() - 1);
        computeCombinations(list, nums, start + 1, num, combination);
    }
}

//找出所有的时间的可能性，反向去验证亮灯的数量，来筛选符合条件的时间。
class Solution2 {
    public int toCa(int timeNum) {
        int sum = 0;
        while (timeNum > 0) {
            if (timeNum % 2 == 1)
                sum++;
            timeNum /= 2;
        }
        return sum;
    }

    public List<String> readBinaryWatch(int num) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (toCa(hour) + toCa(minute) == num)
                    linkedList.add(String.format("%d:%02d", hour, minute));
            }
        }
        return linkedList;
    }
}

class Solution3 {//通过Integer内建的bitCount函数来求出亮灯数量，从而筛选出结果。

    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == num) //
                    times.add(String.format("%d:%02d", hour, minute));
            }
        }
        return times;
    }
}

//*********上面的两个例子证明bitCount比自己算bit的数量要更加耗费时间************