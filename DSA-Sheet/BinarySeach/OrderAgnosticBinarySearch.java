package BinarySeach;

public class OrderAgnosticBinarySearch {

    static int orderAgnostic(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // check whether the array is sorted in ascending order or descending order,
        // if the first element is < last element its means its sorted in accending
        // order.
        // if the first element is > last element its means its sorted in descending
        // order
        // now jsut check whether the array is sorted in ascending order or descending
        // order by taking a boolean expression.
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid; // return the index of target element.
            }

            // take the boolean value here and check if the arr is sorted in accending order
            // the do this .
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            // else if the array is sorted in decending order then do this.
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 5, 7, 12, 15, 19, 36, 48 }; //asc
        int[] arr = {75,63,55,41,33,23,19,11,9,-2}; //dsc
        int target = 41;
        int res = orderAgnostic(arr, target);
        System.out.println(res);

    }
}
