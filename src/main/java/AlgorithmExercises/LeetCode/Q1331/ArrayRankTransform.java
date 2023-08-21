package AlgorithmExercises.LeetCode.Q1331;

import java.util.*;

/**
 * Class ArrayRankTransform is created on 2020/4/11 13:24.
 *
 * @author Ray
 * @version 2020/4/11
 **/

public class ArrayRankTransform {
}

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0)
            return new int[]{};

        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(new Pair(i, arr[i]));
        }

        list.sort(Comparator.comparingInt(o -> o.value));

        int p = 1;
        int preValue = list.get(0).value;
        arr[list.get(0).prePosition] = p;

        for (int i = 1; i < list.size(); i++) {
            int tmpValue = list.get(i).value;
            int tmpPrePosition = list.get(i).prePosition;
            if (tmpValue != preValue)
                p += 1;

            arr[tmpPrePosition] = p;
            preValue = tmpValue;
        }

        return arr;
    }

    static class Pair {
        int prePosition;
        int value;

        public Pair(int prePosition, int value) {
            this.prePosition = prePosition;
            this.value = value;
        }
    }
}
