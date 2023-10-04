package Basics;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String fruits = sc.next();

        // -------------------------------------------
        // if(fruits.equals("mango")){
        // System.out.println("king of fruits");
        // }

        // if(fruits.equals("apple")){
        // System.out.println("vitamin c fruit");
        // switch (fruits) {

        // -----------------------------------------

        // either this way or normal swich systax both will work fine.

        // -----------------------------------
        // case "mango" -> System.out.println("king of fruit");
        // case "apple" -> System.out.println("apple fruit");
        // case "grapes" -> System.out.println("grapes fruits");
        // default -> System.out.println("unknown fruit");

        // --------------------------------------

        // case "mango":
        // System.out.println("king of fruit");
        // break;
        // case "apple":
        // System.out.println("apple fruit");
        // break;
        // case "grapes":
        // System.out.println("grapes fruits");
        // break;
        // default:
        // System.out.println("unknown fruit");

        // int day = sc.nextInt();
        // switch (day) {
        // case 1 -> System.out.println("monday");
        // case 2 -> System.out.println("tuesday");
        // case 3 -> System.out.println("wednesday");
        // case 4 -> System.out.println("thursday");
        // case 5 -> System.out.println("friday");
        // case 6 -> System.out.println("saturday");
        // case 7 -> System.out.println("sunday");
        // default -> System.out.println("Enter vlid number");
        // }

        // -----------------------
        int days = sc.nextInt();

        switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }
    }
}

/*
 * - it doesnot check line by line like if conditions , it finds the value and
 * directly jumps to that statement and returns the value;
 * In Java, the switch statement is used for conditional branching based on the
 * value of an expression. It provides an efficient way to select one of several
 * code blocks to execute, depending on the value of the expression. The primary
 * reasons for using a switch statement in Java are:
 * 
 * Readability and Maintainability: When you have multiple conditions to check
 * against a single expression, using a switch statement can make your code more
 * readable and easier to maintain than using a series of nested if-else
 * statements. It can help in organizing and structuring your code in a more
 * understandable manner.
 */
