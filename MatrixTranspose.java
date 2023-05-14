import java.util.*;

public class MatrixTranspose {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int [][] matrix= new int [rows][cols];
        //Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        //Transpose of Matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               System.out.print( matrix[j][i] +" " );
            }
            System.out.println();
        }

    }
}
