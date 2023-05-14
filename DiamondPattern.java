import java.util.*;

public class DiamondPattern {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //Upper Half
        for (int i = 1; i <= n; i++) {
            // Space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Star print

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        //Lower Half
        for (int i = n; i >= 1; i--) {
            // Space print
            System.out.print(" ");
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Star print

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}
