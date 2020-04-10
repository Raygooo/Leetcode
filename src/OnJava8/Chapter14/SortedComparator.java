package OnJava8.Chapter14;

import java.util.Comparator;

/**
 * Class SortedComparator is created on 2020/1/11 10:02.
 *
 * @author Ray
 * @version 2020/1/11
 **/

public class SortedComparator {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
