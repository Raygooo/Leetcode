package NowCoder.HuaWei;

import java.util.*;

/**
 * Class RandomNumberAndSorting is created on 2019/12/10 16:43.
 *
 * @author Ray
 * @version 2019/12/10
 **/

public class RandomNumberAndSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            treeSet.add(sc.nextInt());
        }
        for (int num :
                treeSet) {
            System.out.println(num);
        }
    }

}
