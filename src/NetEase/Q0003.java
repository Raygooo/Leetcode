package NetEase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Class Q0003 is created on 02/08/2019 22:47.
 *
 * @author Ray
 * @version 02/08/2019
 **/

public class Q0003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> ask = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            ask.add(x);
            int count = 0;
            for (int j = 0; j < n; j++) {
                int number = arr.get(j);
                if (i > 0 && number >= ask.get(i - 1)) {
                    break;
                }
                if (number >= x) {
                    count++;
                    arr.set(j, number - 1);
                }
            }
            System.out.println(count);
        }
    }
}

