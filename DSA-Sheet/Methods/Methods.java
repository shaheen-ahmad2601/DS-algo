package Methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        // Q: take input of two number and print the sum;
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter first number");
        // int num1=sc.nextInt();
        // System.out.println("Enter second number");
        // int num2=sc.nextInt();

        // int sum = num1 + num2;
        // System.out.println("Sum is : " + sum);
        // sum();
        int result = sum2();
        System.out.println(result);

    }

    // this method's return type is integer so it will return the sum.
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        return sum;
        // return means the function is end.

        // System.out.println("this will never return");
    }

    // this functio is not returning anything. so the return type would be void.

    // static void sum() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter first number: ");
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter second number: ");
    //     int num2 = sc.nextInt();

    //     int sum = num1 + num2;
    //     System.out.println("Sum is : " + sum);
    // }

}
