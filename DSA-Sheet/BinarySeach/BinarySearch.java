package BinarySeach;

import java.util.Arrays;
import java.lang.Math;

// Q: Return the index of the target element or return -1;

public class BinarySearch {

    public static int findTargetValue(int[] arr, int target) {

        int start = 0, end = arr.length - 1, mid;

        while (start <= end) {
            // find the middle element.
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end=mid-1;;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 12, 15, 19, 36, 48 };
        int target = 12;
        int res = findTargetValue(arr, target);
        System.out.println(res);

    }
}
// strt + (end-start)/2; => 2s+e-s/2 =>s+e/2;

// star+end/2 = might exceeds the range of integer.

// It will take only one step to find the target value in he best case, does not depend on array size.
// as the size increase the time remain constant for best case. o(1)
// N/2=N/2**1 - N/4 = N/2**2 - N/8 = N/2**3 ------------ 1=N/2**k
//  worst case -> O(logN);
// N/2k=1 => N = 2**k  => log(N) = log(2**k) => log(N)=klog2 => k=log(N)/log2 => k=log(N)

/*
 * find the mid element
 * if target element > mid search in right side
 * if target element < mid search in left side
 * if mid element == target => mid element;
 * 
 * when you devide the arrray either its left or right side
 * so its create the new array that we work on and so on..
 * find the length of the array
 * and take mid integer value.
 * start+end/2; mid
 */

// 1. find the mid element
// 2. check the target element in left and right side.
// 3. array should be sorted.