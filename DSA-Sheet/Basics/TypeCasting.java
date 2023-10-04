package Basics;


import java.util.Scanner;

public class TypeCasting {
    
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      
    //  int num = sc.nextInt();
    //  System.out.println(num);


      // this is type casting compressing the bigger number into the smaller.
    //  int num = (int)(45.45f);
    //  System.out.println(num);

    //   double d= (double)(4554354354354345L);
    //   System.out.println(d);

    // celcius to faranheight.
      System.out.println("please enter temp in Celsius: ");
      float tempC = sc.nextFloat();

      float tempF = (tempC* 9/5) + 32;
      System.out.println(tempF);

    }
}

/* 
A number can be converted to floating point numbers but floating point numbers cannot be converted into a number
 
input float = int=5 -> float=5.0
input int = float=5.5 -> it will through error.
float = 4.4 >  int=4.
*/
