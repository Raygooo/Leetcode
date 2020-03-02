package SelfLearn.Combinations;

import java.util.ArrayList;

/**
 * Class Combinations is created on 2020/2/1 12:50.
 *
 * @author Ray
 * @version 2020/2/1
 **/

public class Combinations {
    public static ArrayList<String> getCombinations(char[] charSequence, int num) {
        ArrayList<String> resultList = new ArrayList<>();
        ArrayList<Character> combinationTemp = new ArrayList<>();
        computeCombinations(resultList, charSequence, 0, num, combinationTemp);
        return resultList;
    }

    private static void computeCombinations(ArrayList<String> resultList, char[] charSequence, int start, int num,
                                            ArrayList<Character> combination) {
        if (num == 0) {
            StringBuilder s = new StringBuilder();
            for (Character character : combination) {
                s.append(character);
            }
            resultList.add(s.toString());
            return;
        }

        if (start == charSequence.length) {
            return;
        }

        combination.add(charSequence[start]);
        computeCombinations(resultList, charSequence, start + 1, num - 1, combination);
        combination.remove(combination.size() - 1);
        computeCombinations(resultList, charSequence, start + 1, num, combination);
    }
}
