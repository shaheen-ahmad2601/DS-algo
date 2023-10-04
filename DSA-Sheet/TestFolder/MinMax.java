package TestFolder;

import java.util.Arrays;

public class MinMax {

    static int[] minMaxValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // int[] result = { min, max };
        // return result;
        return new int[] {min,max};

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 6, 7, 12, 7 };
        int[] result = minMaxValue(arr);
        System.out.println(Arrays.toString(result));
    }
}
