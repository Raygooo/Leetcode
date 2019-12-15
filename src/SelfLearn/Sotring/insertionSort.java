package SelfLearn.Sotring;

/**
 * Class insertionSort is created on 2019/12/10 20:30.
 *
 * @author Ray
 * @version 2019/12/10
 **/

public class insertionSort {

    void insertionSort(int[] a){
        int j;

        for (int p = 1; p < a.length; p++) {
            int tmp = a[p];

            for (j = p; j > 0 && tmp - a[j-1] < 0 ; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

}
