package Arrays;

import java.util.Arrays;

public class TargetSum {

    public static int[] findTargetValue(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] res = { arr[i], arr[j] };
                    return res; // [2,7] -> 0-index,1-index
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 1, 10 };
        int target = 9;
        int[] result = findTargetValue(arr, target);
        // System.out.println(Arrays.toString(result));

        if (result != null) {
            System.out.println("Pair fount: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No Pair fount with the target sum.");
        }
    }
}
