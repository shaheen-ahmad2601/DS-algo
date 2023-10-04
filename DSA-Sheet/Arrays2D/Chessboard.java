package Arrays2D;

public class Chessboard {
    
    public static void main(String[] args) {
        int rows = 8;
        int cols = 8;

        int [][] chessBoard = new int [rows][cols];
        // fill the chess board with values  
        int value=1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                chessBoard[i][j] = value;
                value++;
            }
        }

        System.out.println("chessboard");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }

    }
}
