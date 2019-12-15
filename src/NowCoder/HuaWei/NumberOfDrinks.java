package NowCoder.HuaWei;

import java.util.Scanner;

/**
 * Class NumberOfDrinks is created on 2019/12/10 16:34.
 *
 * @author Ray
 * @version 2019/12/10
 **/

public class NumberOfDrinks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num != 0) {
                System.out.println(numberOfDrinks(num));
            }
        }
    }

    public static int numberOfDrinks(int n){
        int result = 0;
        while(n > 2) {
            result += n/3;
            n = n%3 + n/3;
        }
        if(n == 2)
            result += 1;
        return result;
    }
}
