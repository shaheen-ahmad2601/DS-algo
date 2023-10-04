package Methods;

public class Scope {

    public static void main(String[] args) {
        // this a and b is only accessible in this scope only we can not access this out
        // of this methods.
        int a = 2;
        int b = 20;

        {
            // block scope.
             a = 45;
             int c=99;
        }
        // System.out.println(c); // error. cannot use outside the block scope


        // scoping in for loops.
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]); 
        }
        // System.out.println(i); error.

    }

    static void rendom() {
        int num = 45;
        // this num is only accessible in this scope only , we can not use this num out
        // of this methods. this is called functional scope.
    }

    // anything initialize out the block can be used inside the block scope but anything initialized inside the block can not be used outside the block.

    // anythig initialize inside the block scope can definately be initialized outside the block.

}
