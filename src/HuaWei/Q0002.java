package HuaWei;

/**
 * Class Q0002 is created on 2019/12/10 19:52.
 *
 * @author Ray
 * @version 2019/12/10
 **/

public class Q0002 {
    public void swapWithZero(int[] array, int len, int n) {
    }

    public void sort(int[] array, int len) {
        int max = 0;

        while (len > 1) {
            swapWithZero(array, len, array[len - 1]);
            for (int i = 0; i < len - 1; i++) {
                if (array[i] > max)
                    max = array[i];
            }

            swapWithZero(array, len, max);
            max = 0;
            len--;
        }
    }
}



