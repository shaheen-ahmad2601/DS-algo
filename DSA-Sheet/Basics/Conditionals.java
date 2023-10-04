package Basics;

public class Conditionals {
    public static void main(String[] args){
        /*      
         
        if(true){
            do this
        }else{
            do this.
        }

         */

        //  int salary = 400;
        //  if(salary>500){
        //     salary+=100;
        //  }else{
        //     salary-=100;
        //  }

        //  System.out.println(salary);

        // multiple if else statements
       // only one statement ill execute.  
        int salary = 500;

        if(salary>500){
            salary-=200;
        }
        else if(salary<500){
            salary+=100;
        }
        else if(salary==500){
            salary+=50;
        }
        System.out.println(salary);
}
}
