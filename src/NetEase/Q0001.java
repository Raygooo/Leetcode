package NetEase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Class Q0001 is created on 02/08/2019 22:46.
 *
 * @author Ray
 * @version 02/08/2019
 **/

public class Q0001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<pair> orderResult = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            orderResult.add(new pair(i + 1, c, 0.0));
        }
        orderResult.sort((o1, o2) -> {
            if (o1.result == o2.result)
                return 0;
            if (o1.result > o2.result)
                return 1;
            else return -1;
        });
        double size = orderResult.size();

        for (int i = 0; i < orderResult.size(); i++) {
            pair pair = orderResult.get(i);
            pair.percentage = (size - (double) (i + 1)) / size;
        }
        orderResult.sort((o1, o2) -> {
            if (o1.ID == o2.ID)
                return 0;
            if (o1.ID > o2.ID)
                return 1;
            else return -1;
        });

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int askId = sc.nextInt();
            System.out.println(String.format("%f", orderResult.get(askId - 1).percentage * 100));
        }


    }

    static class pair {
        public pair(int ID, int result, double percentage) {
            this.result = result;
            this.percentage = percentage;
        }

        int result;
        int ID;
        double percentage;
    }

}
