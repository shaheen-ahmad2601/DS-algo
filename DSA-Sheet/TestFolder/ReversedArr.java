package TestFolder;

import java.util.Arrays;

public class ReversedArr {

    static int[] reverseArr(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int value = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[value] = arr[i];
            value++;
        }
        return reversedArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] result = reverseArr(arr);
        System.out.println(Arrays.toString(result));

    }

    
}

// * 1. We create a new array called reversedArr to store the reversed elements.
// *
// * 2. We use a loop to iterate through the original array arr in reverse
// order.
// *
// * 3. Inside the loop, we assign the elements from arr to reversedArr in
// reverse
// * order.
// *
// * 4. We increment the index variable to keep track of the current position in
// * the reversedArr.
// *
// * 5. Finally, we return the reversedArr, which contains the reversed elements
// * of the original array.
// *
// * Now, your code should correctly reverse the array and return the reversed
// * array as expected.