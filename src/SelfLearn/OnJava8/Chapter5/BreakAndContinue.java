package SelfLearn.OnJava8.Chapter5;

/**
 * Class BreakAndContinue is created on 2020/3/2 19:12.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i :
                Range.range(100)) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
