package Arrays;
// https://igotanoffer.com/blogs/tech/array-interview-questions

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Q. Store a roll no.
        Scanner sc = new Scanner(System.in);

        // syntax
        // datatypes[] variableName = new datatype[size]
        // int [] roll = new int [5];
        // int [] rollNo = {3,4,6,7,43,23};

        // int[] roll; // declarartion of array: rolll is getting define in the stack;
        // roll = new int[5]; // Initialization: in actual here object is being created
        // in the memory(heap)

        // String[] arr = new String[4];
        // System.out.println(arr[0]); // null

        // int[] arr = new int[4];
        // arr[0] = 23;
        // arr[1] = 34;
        // arr[2] = 12;
        // arr[3] = 5;
        // [23,34,12,5]
        // System.out.println(Arrays.toString(arr)); // to print an array.

        // System.out.println("Enter array: ");

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for better loop
        // for (int num : arr) {// for everyelemet in array , print the element.
        // System.out.print("this is from num loop: "+ num + " "); // here num
        // reperesents eleement of the array.
        // }

        // --------------------

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();

        }
        System.out.println(Arrays.toString((str)));

    }

    
}


class PeakElements {
  
    // Find the peak element in the array
    static int findPeak(int arr[], int n)
    {
        // First or last element is peak element
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }
  
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.print("Index of a peak point is " + findPeak(arr, n));
    }
}
