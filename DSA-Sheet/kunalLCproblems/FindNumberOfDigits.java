package kunalLCproblems;

public class FindNumberOfDigits {
        public static int findNumbers(int[] nums) {
         int count=0;
         for(int num : nums){
             if(isEven(num)){
                 count++;
             }
         }
         return count;   
        }
    
        public static boolean isEven(int num){
          int countOfDigits = digits(num);
          return countOfDigits % 2==0;
        }
        static int digits(int num) {
    
            if (num < 0) {
                num = num * -1; // if the number is -ve , make it positve. num = -num
            }
            return (int) (Math.log10(num)) + 1; // to find the count of digits
        }
        public static void main(String[] args) {
            int[] nums = {12,345,2,6,7896,1212};
            int res = findNumbers(nums);
            System.out.println(res);
        }
    
        // public static int digits(int num){
    
        //    if(num<0){
        //        num=num*-1; // if the number is -ve , make it positve.
        //    }
    
        //    if(num==0){
        //        return 1;
        //    }
    
        //     int count=0;
        //     while(num>0){
        //         count++;
        //         num=num/10; // num/=10;
        //     }
        //     return count;
        // }
    }
    
    // 1. check the count of the digits
    // 2. then check the count of the digits are even or not
    // 3. call the even function and check if its true return count.




