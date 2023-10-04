package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPrime {

    public static boolean isprime(int number) {

        if (number < 2) {
            return false;
        }
        // run a loop and check the codition.
        // run till square root to not repeat the numbers.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static List<Integer> findPrime(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int nums = 2; nums <= limit; nums++) {
            if (isprime(nums)) {
                primes.add(nums);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println("Enter a limit to find the prime numbers: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.close();
        List<Integer> primeNumbers = findPrime(limit);
        System.out.println("Prime numbers upto " + limit + ": " + primeNumbers);

    }
}

// --------------Prime-----------------------

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class FindPrime {

// public static boolean isPrime(int num) {
// if (num < 2) {
// return false;
// }

// for (int i = 2; i <= Math.sqrt(num); i++) {
// if (num % i == 0) {
// return false;
// }
// }

// return true;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int number = sc.nextInt();
// sc.close();
// boolean res = isPrime(number);
// System.out.println(res);

// }
// }

/*
 * 
 * boolean flag = true;
 * int i=2;
 * while(i<num){
 * if(num%i==0){
 * flag = false;
 * }
 * i++;
 * }
 * if(flag){
 * System.out.println("Prime");
 * }else{
 * System.out.println("Not Prime");
 * }
 * 
 */