package Arrays;

public class SecondLargest {

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondL = largest;
                largest = arr[i];
            } else if (arr[i] > secondL && arr[i] != largest) {
                secondL = arr[i];
            }
        }
        return secondL;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 16, 4, 5, 10, 8 };
        int res = secondLargest(arr);
        System.out.println("Second largest Element is: " + res);

    }
}

/*
 * We maintain two variables, largest and secondLargest, to keep track of the
 * largest and second-largest elements.
 * 
 * We iterate through the array and update these variables accordingly. If we
 * encounter an element greater than the current largest, we update both largest
 * and secondLargest. If we encounter an element greater than the current
 * secondLargest but not equal to largest, we update secondLargest.
 * 
 * Finally, we return the secondLargest element.
 * 
 * When you run this code with the input array {12, 3, 6, 4, 5, 10, 8}, it will
 * correctly find and print the second-largest element, which is 10.
 */
