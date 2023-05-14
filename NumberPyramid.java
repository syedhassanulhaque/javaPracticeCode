import java.util.*;

public class NumberPyramid {
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
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 != 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }

            }

            System.out.print("\n");
        }

    }
}
