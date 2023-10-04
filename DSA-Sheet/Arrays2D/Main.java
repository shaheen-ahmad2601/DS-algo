package Arrays2D;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         * 
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * 
         */

        // int [][] arr = new int [3][];
        // its an arr of arrays.

        // int [][] arr = new int[3][4];
        // System.out.println(arr.length); // 3 -> length depends on row size.

        int[][] arr = {
                { 1, 2, 3 }, // 0th index.
                { 4, 5, 6 }, // 1st index.
                { 7, 8, 9 }, // 2nd index. arr[2] = {7,8,9}
        };


        // row size matter , colums size varies so we can tackle this by arr[i].length methods.
        // every column size is varying respect to rows.

        // int[][] arr1 = {
        //         { 1, 2, 3 }, // 0th index.
        //         { 4, 5 }, // 1st index. arr.length=2;
        //         { 7, 8, 9, 5 }, // 2nd index. arr[2] = {7,8,9}
        // };

        // input
        // int [][] arr = new int[3][3];

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = sc.nextInt();

        //     }
        // }

        //  for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col]+" ");

        //     }
        //     System.out.println();
        // }

        //  for (int row = 0; row < arr.length; row++) {
        //    System.out.println(Arrays.toString(arr[row]));
        // }


        // enhanced for loop.
        for(int[] a:arr){ // the datatype of every element in the array is itself an array.so use int[];
            System.out.println(Arrays.toString(a));
        }

    }
}

// arr[i].length -> if the row[0] is havign 3 colums then run the j loop for 3
// colums
// if the row[1] is havign 2 colums then run the j loop for 2 colums.