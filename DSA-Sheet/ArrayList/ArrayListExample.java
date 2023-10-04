package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntex: Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>(10); -> initial capacity=10;
        // altough it doesn't matter the capacity because its a dynamic arr list. it grows and shrinks on its own. a/c to the use case.

        // Add elements to the ArrayList
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(7);
        list.add(5);
        // System.out.println(list.contains(9)); // true;

        // Access elements by index
        int firstNumber = list.get(0); // 4
        int secondNumber = list.get(1); // 6
        int thirdNumber = list.get(2); // 9

        // Modify an element by index
        list.set(1, 40);// Replaces 10 with 20

        // Remove an element by index
        list.remove(2); // Removes 3

        // Get the size of the ArrayList
        int size = list.size(); // 2
        System.out.println("size of the list: " + size);

        // Iterate through the elements
        for (int num : list) {
            System.out.println("numbers in arrlist: " + num);
        }
        
        for(int i=0; i<5; i++) {
         System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here.
        }
    }
}

// ---------------------------------------------------Theory----------------------------

/*
 * An ArrayList in Java is a dynamic array-like data structure that is part of
 * the Java Collections Framework. It provides a way to store and manipulate a
 * collection of elements. Here are some key points and explanations about
 * ArrayList:
 * 
 * Dynamic Sizing: Unlike regular arrays in Java, which have a fixed size, an
 * ArrayList can dynamically grow or shrink in size as elements are added or
 * removed. This makes it more flexible and convenient when you don't know the
 * exact size of your collection in advance.
 * 
 * Generic: An ArrayList can store elements of a specific data type, and it
 * enforces type safety. For example, you can have an ArrayList of integers
 * (ArrayList<Integer>) or strings (ArrayList<String>), and the compiler will
 * ensure that you can only add elements of the specified type.
 * 
 * Ordered Collection: ArrayList maintains the order of elements, which means
 * that the elements are stored in the same order they were added. You can
 * retrieve elements by their index, just like with regular arrays.
 * 
 * Automatic Resizing: When you add elements to an ArrayList and it reaches its
 * capacity, it automatically resizes itself to accommodate more elements. It
 * typically doubles its size when it needs to expand, which helps in achieving
 * efficient amortized time complexity for adding elements.
 * 
 * Fast Access: ArrayList provides fast access to elements by index. Accessing
 * an element by index is an O(1) operation because it uses direct addressing.
 * 
 * Insertion and Deletion: Inserting or removing elements from an ArrayList is
 * relatively efficient when you're working near the end of the list. However,
 * inserting or removing elements in the middle of the list can be less
 * efficient because it may require shifting elements.
 * 
 * 
 * In summary, ArrayList is a versatile and widely used data structure in Java
 * that provides dynamic sizing, type safety, ordered collection, and efficient
 * access to elements. It is suitable for a wide range of applications where you
 * need to manage a collection of elements with variable size.
 */
