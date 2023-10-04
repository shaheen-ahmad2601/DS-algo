package Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CallbyValue {
    
    public static void main(String[] args) {
        int [] arr = {2,4,6,45,3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void change(int[] nums){
       nums[0] = 56;
    }
}
