package Arrays;

public class Duplicates {

    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr; // No duplicates to remove
        }

        int uniqueCount = 1; // Count of unique elements
        for (int i = 1; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element is a duplicate
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the unique portion of the array
            if (!isDuplicate) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        // Create a new array with only the unique elements
        int[] uniqueArr = new int[uniqueCount];
        System.arraycopy(arr, 0, uniqueArr, 0, uniqueCount);

        return uniqueArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1, 4, 5, 4 };

        // Remove duplicates from the array
        int[] uniqueArr = removeDuplicates(arr);

        // Print the unique array
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }

}
