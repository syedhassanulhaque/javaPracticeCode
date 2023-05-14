import java.util.*;

public class PalindromePattern {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Number print
           int k=i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                
                if (j<=(2 * i - 1)/2) {
                    System.out.print(k);
                    k--;
                }
                else{
                    System.out.print(k);
                    k++;
                }

            }

            System.out.print("\n");
        }

    }
}
