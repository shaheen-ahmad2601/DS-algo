package Arrays;

import java.util.Arrays;

// Q: Find the Maximum and Minimum Values in an Array:
// Write a Java program to find the maximum and minimum values in an array of integers.
public class MinMax {

    
    static int[] minMax(int[] arr) {
        
        // check if the array is empty return 0,0;
        if (arr.length == 0)
        return new int[] { 0, 0 };
        int min=5;
        int max=min;
        // int min = arr[0];
        // int max = arr[0];
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        
        // To find the mix and max.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] res = { min, max };
        return res;
        // return new int[]{min, max}; - i can also return like this.
    }
    
    public static void main(String[] args) {
        int[] arr = { 5, 8, 0, 1, 2 };
        int[] res = minMax(arr);
        System.out.println(res[0] + " " + res[1]); // will return 1,9
        // System.out.println(Arrays.toString(res)); //will return [1,9]
    
    }
}

/*
 * any valid integer value in the array, not necessarily arr[0]. The important
 * thing is to ensure that min is initially set to a value that exists in the
 * array, so that the comparisons in the loop work correctly.
 * 
 * Integer.MAX_VALUE is a constant in Java that represents the maximum value an
 * int can hold. In Java, an int is a 32-bit signed integer, which means it can
 * hold values from -2^31 to 2^31-1 (inclusive).
 * 
 * Integer.MAX_VALUE is equal to 2,147,483,647. It is the largest positive
 * integer that can be stored in an int variable.
 * 
 * When you initialize min to Integer.MAX_VALUE, you are effectively setting it
 * to a value that is larger than any possible value in the array you intend to
 * search. This is a common technique used when finding the minimum value in an
 * array because it ensures that the first element of the array will always be
 * smaller than the initial value of min. As you iterate through the array and
 * compare each element with min, any value smaller than min will replace it,
 * ensuring that min eventually holds the minimum value from the array.
 * 
 * Here's how it works:
 * 
 * You initialize min to Integer.MAX_VALUE, which is a very large positive
 * integer.
 * 
 * As you iterate through the array and compare elements to min, if you
 * encounter an element that is smaller than the current value of min, you
 * update min to hold that smaller value.
 * 
 * By the end of the loop, min will contain the smallest value in the array, as
 * it has been continually updated whenever a smaller value was encountered
 * during the iteration.
 * 
 * This technique ensures that min starts with a value that is guaranteed to be
 * larger than any possible value in the array, so it can correctly track and
 * store the minimum value.
 */