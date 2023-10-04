package Arrays;
import java.util.Arrays;

public class FindSum {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = findSum(arr);
        System.out.println(result);
    }

    static int findSum(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
