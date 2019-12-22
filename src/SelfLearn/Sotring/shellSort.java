package SelfLearn.Sotring;

/**
 * Class shellSort is created on 2019/12/10 20:55.
 *
 * @author Ray
 * @version 2019/12/10
 **/

public class ShellSort {
    void shellSort(int[] a) {
        int j = 0;

        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int tmp = a[i];
                for (j = i; j >= gap && tmp - a[j - gap] < 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = tmp;
            }
        }
    }
}
