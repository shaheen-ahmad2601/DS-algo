package Basics;

import java.util.Scanner;

public class TypeCheck {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        // System.out.println(in.next().trim());

        // String str = "hello world";

        // System.out.println(str.charAt(3));

        if(ch>='a' && ch <= 'z'){
            System.out.println("lowercase " + ch);
        }
        else{
            System.out.println("Uppercase " + ch);
        }


    }
}
