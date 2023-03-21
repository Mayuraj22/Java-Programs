import java.util.*;

public class quicksort {
    public static void quickksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // last element
        int pIdx = partition(arr, si, ei);
        quickksort(arr, si, pIdx - 1);// left part
        quickksort(arr, pIdx + 1, ei);// right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// to make place smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i]; // pivot=arr[i]
                arr[i] = temp;

            }

        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}