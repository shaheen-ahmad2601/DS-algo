package Arrays;

import java.util.Arrays;

public class TwoSum {

    public static int[] getTargetSum(int[] arr, int target) {

        Arrays.sort(arr);

        int left = 0, right = arr.length - 1, sum = 0;

        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum == target) {
                int[] res = { left, right }; // if found return indexies.
                return res;
            } else if (sum < target) {
                left++;// if the sum is < target then increase left++
            } else {
                right--; // if the sum > target then decrease right--
            }
        }
        return null; // if not found then return null
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 3, 10 }; // sorted array [2,3,4,7,10] - index = 0,3
        int target = 9;
        int[] result = getTargetSum(arr, target);
        // System.out.println(Arrays.toString(result));

        if (result != null) {
            System.out.println("Pair found Element indexes : " + result[0] + " " + result[1]);
        } else {
            System.out.println("Pair not found in the array");
        }

    }
}

// Q: Find the target sum in the given array and return the indexes of the
// elements if not fount , return null.