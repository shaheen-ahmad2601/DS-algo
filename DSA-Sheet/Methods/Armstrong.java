package Methods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean res = isArmstrong();
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        // System.out.println(res);
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;// to get last degit
            n = n / 10;
            sum += rem * rem * rem; // doing cube and adding to sum
        }
        return sum == original;// true or false.
    }
}
// armstrong number. if the sum of qube of every digit is same like the original
// number then its armstrong number.
