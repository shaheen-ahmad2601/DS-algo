package Basics;

public class Shadowing {
    // anything initialized ih side this class will be accessible to everyone in this class, loops methods etc.
    static int a=90;
    public static void main(String[] args) {
        System.out.println(a); //90
        int a = 30; // shadowed the value of previous a.
        System.out.println(a); //30
        fun();
    }


    static void fun(){
        System.out.println(a);
    }
}

/*    
 In Java, the concept of scope refers to the region of a program where a particular variable is valid and can be used. Scopes determine the visibility and lifetime of variables, methods, and other program elements. Understanding the different types of scopes in Java is crucial for writing well-structured and bug-free code. There are primarily three types of scopes in Java:
 */
