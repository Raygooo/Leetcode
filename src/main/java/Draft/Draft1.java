package Draft;

import java.util.Scanner;

/**
 * Class Draft.Main is created on 2019/12/20 15:51.
 *
 * @author Ray
 * @version 2019/12/20
 **/


public class Draft1 {
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input < 0)
            throw new Exception("required positive number!");
        if (String.valueOf(input).length() > 5)
            throw new Exception("too many digits");
        System.out.println("count digits: " + count(input));
        if (input == 0)
            System.out.println(0);
        while (input != 0) {
            System.out.println(input % 10);
            input /= 10;
        }
        System.out.println();
    }

    static int count(int num) {
        int res = 1;
        while (num / 10 != 0) {
            num /= 10;
            res++;
        }
        return res;
    }
}
