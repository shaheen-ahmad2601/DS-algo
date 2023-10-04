package Arrays;

public class FindTillLimit {

    public static int findTillLimit(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 8, 10, 2 };
        int target = 2;
        int res = findTillLimit(arr, target, 1, 4);
        System.out.println(res);

    }
}

// find the element in the arr till 1 to 4 limit if found return element else
// return -1;
