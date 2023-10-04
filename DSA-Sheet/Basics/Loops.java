package Basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // use for loop when you kknow how many times loop is going to run , use while
        // loop when you are not sure.

        // like keep taking input of users untill users press x.
        try (Scanner sc = new Scanner(System.in)) {
            // int n = sc.nextInt();
            // for (int i = 1; i <= n; i++) {
            // System.out.println(i);
            // }

            // int i=1;

            // while (i <= n) {
            // System.out.println(i);
            // i++;
            // }
            // System.out.println(i);

            // in do while loop program is going to run atleat once.
            // int n=1;
            // do {
            // System.out.println(n);
            // n++;

            // } while (n<=5);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // find the largest?
            // int max=a;
            // if(b>max){
            // max=b;
            // }
            // if(c>max){
            // max=c;
            // }

            int max = Math.max(c, Math.max(a, b));

            System.out.println(max);

        }

    }

}
