package OnJava8.Chapter5;

/**
 * Class LabeledWhile is created on 2020/3/2 19:27.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            System.out.println("Outer while loop");
            while (true) {
                i++;
                System.out.println("i = " + i);
                if (i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    System.out.println("break");
                    break;
                }
                if (i == 7) {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
