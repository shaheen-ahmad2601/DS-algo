package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDAList {

    public static void main(String[] args) {
        // Create a 2D ArrayList of integers
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization.
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt()); // get list element and add the input value

            }
        }
        System.out.println(list);

    }
}

/*
 * ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
 * // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
 * 
 * // Add rows (inner ArrayLists) to the 2D ArrayList
 * matrix.add(new ArrayList<>()); // Row 1
 * matrix.add(new ArrayList<>()); // Row 2
 * matrix.add(new ArrayList<>()); // Row 3
 * 
 * // Add elements to the 2D ArrayList
 * matrix.get(0).add(1); // Add 1 to Row 1
 * matrix.get(0).add(2); // Add 2 to Row 1
 * matrix.get(1).add(3); // Add 3 to Row 2
 * matrix.get(1).add(4); // Add 4 to Row 2
 * matrix.get(2).add(5); // Add 5 to Row 3
 * 
 * // Access elements by row and column
 * int element = matrix.get(1).get(1); // Access the element in Row 2, Column 2
 * (value: 4)
 * 
 * // Iterate through the elements
 * for (ArrayList<Integer> row : matrix) {
 * for (int num : row) {
 * System.out.print(num + " ");
 * }
 * System.out.println(); // Move to the next row
 * }
 */
