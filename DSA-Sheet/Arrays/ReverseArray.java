package Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] reversArray = reverseArray(arr);
        System.out.println(Arrays.toString(reversArray));

    }

    static int[] reverseArray(int[] arr) {
        int[] reversArr = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversArr[index] = arr[i];
            index++;
        }
        return reversArr;
    }

}
/*
 * 1. We create a new array called reversedArr to store the reversed elements.
 * 
 * 2. We use a loop to iterate through the original array arr in reverse order.
 * 
 * 3. Inside the loop, we assign the elements from arr to reversedArr in reverse
 * order.
 * 
 * 4. We increment the index variable to keep track of the current position in
 * the reversedArr.
 * 
 * 5. Finally, we return the reversedArr, which contains the reversed elements
 * of the original array.
 * 
 * Now, your code should correctly reverse the array and return the reversed
 * array as expected.
 * 
 * 
 * 
 * 
 * -----------------------------------------------
 * 
 * In the code, we use the index variable to keep track of the current position
 * in the reversedArr. The purpose of the index variable is to ensure that we
 * place each reversed element from the original array arr into its correct
 * position in the reversedArr. Here's how it works:
 * 
 * Initially, we set index to 0 before entering the loop.
 * 
 * Inside the loop, we assign arr[i] to reversedArr[index]. This means that we
 * take the element at the current position i in the original array and place it
 * into the reversedArr at the current index.
 * 
 * After placing the element into reversedArr, we increment the index by 1 using
 * index++. This move ensures that the next reversed element from arr will be
 * placed in the next position in reversedArr.
 * 
 * We repeat this process for each element in arr as we loop through it in
 * reverse order.
 * 
 * By doing this, we effectively reverse the order of elements from arr and
 * store them in reversedArr in the correct order. The index variable keeps
 * track of where the next element should be placed in reversedArr, ensuring
 * that we don't overwrite previously placed elements.
 * 
 * So, the index variable is essential for ensuring that we correctly populate
 * reversedArr with the reversed elements in their proper order.
 */
