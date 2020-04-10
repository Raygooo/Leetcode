package OnJava8.Chapter5;

import java.util.Random;

/**
 * Class ForInFloat is created on 2020/3/2 18:09.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class ForInFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x :
                f) {
            System.out.println(x);
        }
    }
}
