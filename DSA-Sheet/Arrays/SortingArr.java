package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArr {

    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Eve", "David", "Carol" };

        // Sort the array in lexicographical (ascending) order
        Arrays.sort(names);

        // Print the sorted array
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // -----------------------------------

        int[] arr = { 5, 2, 9, 1, 5, 6 };

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // --------------------Arraylist--------------------

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(22);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(6);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Print the sorted ArrayList
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
