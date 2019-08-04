package NetEase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class Q0002 is created on 02/08/2019 22:47.
 *
 * @author Ray
 * @version 02/08/2019
 **/

public class Q0002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            ArrayList<Integer> circle = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                circle.add(sc.nextInt());
            }

            boolean value = true;

            for (int j = 0; j < n; j++) {
                int leftID;
                int rightID;
                if (j == 0) {
                    leftID = n - 1;
                    rightID = j + 1;
                } else if (j == n - 1) {
                    leftID = j - 1;
                    rightID = 0;
                } else {
                    leftID = j - 1;
                    rightID = j + 1;
                }
                if (circle.get(j) > circle.get(leftID) + circle.get(rightID))
                    value = false;
            }

            if (value)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

