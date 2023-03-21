import java.util.*;

public class firstoccurence {
    public static int firstoccurenc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return firstoccurenc(arr, key, i);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 15, 10, 2, 5, 3 };
        System.out.println(firstoccurenc(arr, 5, 0));
    }

}