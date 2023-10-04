package Basics;

/*  
 - public means it is accessible from everywhere.
 - class is a name of groups of properties and methods.
 - file and class should be same.
 
 */

class Prime { // if you are creaitng a class name should be start with capital letter.

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        // if we are checking for square root the complexity will get reduced.

        int i = 2;
        // for suare root - i*i or Math.sqrt
        while (i < Math.sqrt(n)) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;

    }

    public static void main(String args[]) { // code starts from this point only
        // with name "main" function.
        int n = 19;
        boolean test = prime(n);
        System.out.println(test);
    }

}
