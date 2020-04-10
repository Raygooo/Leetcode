package OnJava8.Chapter5;

/**
 * Class Range is created on 2020/3/2 18:20.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class Range {
    public static int[] range(int range) {
        int[] a = new int[range];
        for (int i = 0; i < range; i++) {
            a[i] = i;
        }
        return a;
    }

    public static int[] range(int start, int end) {
        int[] a = new int[end - start];
        for (int i = start; i < end; i++) {
            a[i - start] = i;
        }
        return a;
    }

    public static int[] range(int start, int end, int step) {
        int size = (end - start) / step;
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = start + i * step;
        }
        return a;
    }
}
