package Arrays2D;

import java.util.Arrays;

public class MaxElement {

    public static int[] maxElement(int[][] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return new int[] { min, max };
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 11, 12, 3 },
                { 17, 22, 25, 45 },
                { 11, 2, 33 },
        };

        int[] res = maxElement(arr);
        System.out.println(res[0]+" "+res[1]);
    }
}

// Q: find min & max element in the arr.