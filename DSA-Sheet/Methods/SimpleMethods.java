package Methods;

import java.util.Scanner;

public class SimpleMethods {

    public static void main(String[] args) {
        // String value = greet();
        // System.out.println(value);
        // int ans = sum3(20, 30);
        // System.out.println(ans);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = sc.nextLine();

        String result = newGreet(name);
        System.out.println(result);
    }

// its return type is string.
    static String newGreet(String name){
        String message = "hello " + name;
        return message;
    }

    // its return type is integer.
    static int sum3(int x, int y) {
        int sum = x + y;
        return sum;
    }

    static String greet() {
        return "hello world from methods!";
    }
}
