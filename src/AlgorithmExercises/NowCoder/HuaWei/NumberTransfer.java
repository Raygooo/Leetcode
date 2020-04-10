package AlgorithmExercises.NowCoder.HuaWei;

import java.util.Scanner;

/**
 * Class NumberTransfer is created on 2019/12/10 17:11.
 *
 * @author Ray
 * @version 2019/12/10
 **/

public class NumberTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(transfer(str));
        }
    }
    public static int transfer(String str) {
        char[] chars = str.toCharArray();
        int res = 0;
        int digits = 1;
        for (int i = chars.length - 1; i > 1; i--) {
            if (chars[i] >= '0' && chars[i] <= '9'){
                res += digits * (chars[i] - '0');
            } else if (chars[i] >= 'A' && chars[i] <= 'F')
                res += digits * (chars[i] - 'A' + 10);
            digits = digits * 16;
        }
        return res;
    }
}
