import java.util.*;

public class Pattern {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int num=1;
        //Pattern 1
        // for (int i = 0; i <= rows; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(num++ + " ");
        //     }
        //     System.out.println();
        // }
        
        //Pattern 2

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                if(((i+j)%2==0))
                System.out.print(0);

                else{
                    
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
