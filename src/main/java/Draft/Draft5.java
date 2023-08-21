package Draft;

/**
 * Class Draft5 is created on 2020/4/8 12:56.
 *
 * @author Ray
 * @version 2020/4/8
 **/

public class Draft5 {

    public void quickSort(int[] arr, int low, int high) {

        if (low > high)
            return;

        int left;
        int right;
        int stan;

        left = low;
        right = high;
        stan = arr[low];

        while (left < right) {
            while (stan <= arr[right] && left < right)
                right--;

            while (stan >= arr[left] && left < right)
                left++;

            if (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }

        //left == right;

        arr[low] = arr[left];
        arr[left] = stan;

        quickSort(arr, low, left - 1);
        quickSort(arr, right + 1, high);
    }

    public void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j;
            int tmp = arr[i];

            for (j = i; j > 0; j--) {
                if (tmp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                }else break;
            }

            arr[j] = tmp;
        }
    }
}
