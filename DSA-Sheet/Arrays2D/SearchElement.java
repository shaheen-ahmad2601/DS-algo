package Arrays2D;

import java.util.Arrays;

public class SearchElement {

    public static int[] getSearchElement(int[][] arr, int target) {
      

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    // return arr[i][j];
                    int[] res = {i, j};
                    return res;
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 12, 2, 23 },
                { 4, 6, 9, 45, 33 },
                { 18, 21, 36, 67, 79 },
        };

        int target = 67;
        int[] res = getSearchElement(arr, target);
        System.out.println(Arrays.toString(res));
    }
}

// Q: find the index of the given target value in the martix if found return index else return -1,-1;