package Basics;

import java.util.Scanner;

// public class Fibonachi {

//     public static void main(String[] args) {
//         // find the nth fibonacci no.
//         // 0,1,1,2,3,5,8,13,....

//         Scanner sc = new Scanner(System.in);

//         int n=sc.nextInt();
//         int a=0;
//         int b=1;

//         int count=2;
//         while(count<=n){
//             int temp = a+b;
//             a=b;
//             b=temp;
//             count++;
//         }
//         System.out.println(b);

//     }
// }

// public class Fibonachi {
//     public static void main(String[] args) {
//         int n=7;
//         long result = fibonacci(n);
//         System.out.println(result);
//     }

//     public static long fibonacci(int n){
//         if(n<=0){
//             return 0;
//         }
//         else if(n==1){
//             return 1;
//         }
//         else{
//             int a=0;
//             int b=1;
//             int temp=0;
//             int i=2;  
//             while(i<=n){
//                 temp=a+b;
//                 a=b;
//                 b=temp;
//                 i++;
//             }
//             return temp;
//         }
//     }

// }




// count the occurrence of the number

// public class Fibonachi {
//     public static void main(String[] args) {
//         // n%10 = last digit.
//         long n=137836730939L;
//         long count=0;
//         while(n>0){
//             long rem = n%10;
//             if(rem==7){
//                 count++;
//             }
//             n=n/10;
//         }
//         System.out.println(count);
//     }

// }


public class Fibonachi {
    public static void main(String[] args) {
        // Reverse of a number;
        int n=24565;

        int ans = 0;
        while(n>0){
            int rem = n%10; // to access last digit.
            n=n/10; // to remove last digit;

            ans=ans*10+rem;
        }
        System.out.println(ans);

    }

}