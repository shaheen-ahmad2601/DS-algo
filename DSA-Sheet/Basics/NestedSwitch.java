package Basics;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int empID = sc.nextInt();
            String Dept = sc.next();

            // switch (empID) {
            // case 1:
            // System.out.println("jerry");
            // break;
            // case 2:
            // System.out.println("tom joe");
            // break;
            // case 3:
            // System.out.println("Emp number 3: ");
            // switch (Dept) {
            // case "IT":
            // System.out.println("IT Department");
            // break;
            // case "management":
            // System.out.println("management department");
            // break;
            // default:
            // System.out.println("no department enter.");
            // }
            // break;
            // default:
            // System.out.println("Enter correct Employee ID:");
            // }

            // -----------------------------------
            
            // Better way to write.
            switch (empID) {
                case 1 -> System.out.println("jerry");
                case 2 -> System.out.println("tom joe");
                case 3 -> {
                    System.out.println("Emp number 3: ");
                    switch (Dept) {
                        case "IT" -> System.out.println("IT Department");
                        case "management" -> System.out.println("management department");
                        default -> System.out.println("no department enter.");
                    }
                }
                default -> System.out.println("Enter correct Employee ID:");
            }

        }
    }
}