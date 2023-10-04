package LinearSearch;

public class LinerSearch {

    public static int linerSearchArr(int[] arr, int target) {
        // check for element at every index if it is = target
        if (arr.length == 0)
            return -1;

        // for (int i = 0; i < arr.length; i++) {
        //     int element = arr[i];
        //     if (element == target)
        //         // return arr[i];
        //         return element;
        // }
        // return -1;

 
        // enhanced for loop.
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        // searc in the arr, return the index if item found if not return -1;
        int[] arr = { 23, 45, 1, 2, 8, 9, -3, 16, -11, 28 };
        int target = 16;
        int ans = linerSearchArr(arr, target);
        System.out.println(ans);

    }
}
