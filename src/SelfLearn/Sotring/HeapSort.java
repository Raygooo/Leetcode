package SelfLearn.Sotring;

/**
 * Class heapSort is created on 2019/12/10 21:07.
 *
 * @author Ray
 * @version 2019/12/10
 **/

public class HeapSort {


    private static int leftChild(int i) {
        return i * 2 + 1;
    }

    void percDown(Integer[] a, int i, int n) {
        int child;
        Integer tmp;

        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && a[child].compareTo(a[child + 1]) < 0)
                child++;
            if (tmp.compareTo(a[child]) < 0)
                a[i] = a[child];
            else
                break;
        }
        a[i] = tmp;
    }

    void heapSort(Integer[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) { /*building head*/
            percDown(a, i, a.length);
        }
        for (int i = a.length; i > 0; i--) { /*deleteMax*/
            swapReferences(a, 0, i);
            percDown(a, 0, i);
        }
    }

    private void swapReferences(Integer[] a, int i, int n) {
        Integer tmp = a[i];
        a[i] = a[n];
        a[n] = tmp;
    }
}
