package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class TryIt {
    
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int[][] arr2 = new int[3][3];
       System.out.println("give the number");

       for(int i=0; i<arr2.length; i++) {
          for(int j=0; j<arr2[i].length; j++){
            arr2[i][j] = sc.nextInt();
            System.out.print(arr2[i][j]+" ");
          }
          System.out.println();
       }
     

        // int [][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9},
        // };
       
        // for(int[] value: arr){
        //     System.out.println(Arrays.toString(value));
        // }

    }
}
