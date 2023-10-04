package Arrays;

import java.util.Arrays;

public class SwapAndRev {

    // two pointer methods.
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }
    }

    // swap the value
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 }; // 5 and 17 will get swapped.
        // swap(arr,1,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
