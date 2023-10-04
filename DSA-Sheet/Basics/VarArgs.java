package Basics;

import java.util.Arrays;

public class VarArgs {
    
    public static void main(String[] args) {
        fun(2,4,5,6,7,3,44,56,79,4);
        // internally it will get converted into an array.
    }

    static void fun(int ...arr){ // like spread operator in js.when you dont know how many integers you are passing, internally its taking array of integers.
        System.out.println(Arrays.toString(arr));

    }
}

// if name of two fucntion is same so its called fucntion overloading.