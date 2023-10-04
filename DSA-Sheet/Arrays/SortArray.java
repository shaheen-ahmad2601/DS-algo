package Arrays;

public class SortArray {

    public static void segregate(int[] arr) {
        int left = 0; // Pointer for the leftmost part (0s)
        int right = arr.length - 1; // Pointer for the rightmost part (unprocessed elements)
        // int right1 = size-1;
        // System.out.println(right);
        // System.out.println(right1);

        while (left < right) {
            if (arr[left] == 0) {
                left++; // Move the left pointer to the right
            } else {
                // Swap arr[left] and arr[right] to move 1s to the right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--; // Move the right pointer to the left
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        segregate(arr);

        System.out.print("Sorted Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

/*
 * You can sort an array of 0s and 1s, also known as segregating 0s and 1s, by
 * using a simple algorithm known as the "Dutch National Flag" algorithm. This
 * algorithm works by maintaining three pointers to divide the array into three
 * sections: 0s on the left, 1s in the middle, and unprocessed elements on the
 * right. Here's how you can implement it in Java:
 * 
 * 
 * 
 * We start with two pointers, left and right, initialized to the leftmost and
 * rightmost positions of the array, respectively.
 * 
 * We use a while loop to iterate through the array until the left pointer is
 * less than the right pointer.
 * 
 * If the element at the left pointer is 0, we simply increment the left
 * pointer, as we want to keep 0s on the left side.
 * 
 * If the element at the left pointer is 1, we swap it with the element at the
 * right pointer and decrement the right pointer. This effectively moves 1s to
 * the right side of the array.
 * 
 * The loop continues until all 0s are on the left, and 1s are on the right.
 * 
 * Finally, we print the sorted array.
 */
