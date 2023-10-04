package Arrays.Top50ArrQues;

public class FindPeakElements {

    public static int findPeakElements(int[] arr, int n) {
        if (n == 1) {
            return 0;
        }
        if (arr[0] >= arr[1]) {
            return 0;
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 45, 1, 0 };
        int n = arr.length;
        int res = findPeakElements(arr, n);
        System.out.println("Index of peak elements is: " + res);
        // System.out.print("Index of a peak point isss: - " + res);
    }
}

/*
 * Find a peak element which is not smaller than its neighbours
 * Given an array arr of n elements that is first strictly increasing and then
 * maybe strictly decreasing, find the maximum element in the array.
 * 
 * Note: If the array is increasing then just print the last element will be the
 * maximum value.
 * 
 * Example:
 * 
 * Input: array[]= {5, 10, 20, 15}
 * Output: 20
 */
