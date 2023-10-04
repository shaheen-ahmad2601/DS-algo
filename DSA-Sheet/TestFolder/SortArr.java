package TestFolder;

import java.util.Arrays;

public class SortArr {

    static void findNums(int[] arr) {
        // first take the pointers for both start and end points.
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 1, 0, 0, 1, 0 };
        findNums(arr);
        System.out.println(Arrays.toString(arr));
    }
}
