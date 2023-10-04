package Arrays;

public class FirstOccurance {

    public static int getFirstOccurance(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return i + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 4, 3, 5, 6 };
        int res = getFirstOccurance(arr);
        System.out.println(res);
        System.out.println("hello world");

    }
}

/*
 * - run a loop for element-1 and then run a another loop for element-2
 * - then initialize the second loop with i+1 to compare the elements.
 * - check if arr[i]=arr[j] return i+1 for 1 based indexing.
 * - if does not find the element return -1;
 */
