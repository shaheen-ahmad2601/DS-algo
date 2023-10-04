package kunalLCproblems;

public class RichestWealth {
    
        public static int maximumWealth(int[][] accounts) {
    
            int rowSum = 0 , max = Integer.MIN_VALUE;
    
            for(int row=0; row<accounts.length; row++){
                rowSum=0;
    
                for(int col=0; col<accounts[row].length; col++){
                    rowSum+=accounts[row][col];
                }
    
                if(rowSum>max){
                    max=rowSum;
                }
            }
            
            return max;
        }

        public static void main(String[] args) {
            int[][] accounts = {
                {1,2,3},
                {3,2,13,5},
                {3,12,1},

            };
            int res = maximumWealth(accounts);
            System.out.println(res);
        }
    }
