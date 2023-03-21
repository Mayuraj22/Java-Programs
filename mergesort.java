import java.util.*;

public class mergesort {
    public static void mergeSort(int arr[], int si, int ei) {
        int mid = si + (ei - si) / 2;// (si+ei)/2
        mergeSort(arr, si, ei);// left part
        mergeSort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int ei) {

        // left(0,3)=4 right(4,6)=3
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // right part
        while (i <= mid) {
            temp[k++] = arr[j + 1];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}