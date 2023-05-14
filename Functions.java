import java.util.*;

public class Functions {

    // public static void MyFunction(String name){
    //     System.out.println(name);
    // }
    public static int Factorial(int a){
       int fact=1;
        for (int i = 1; i <= a; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String args []){
        // Scanner sc= new Scanner(System.in);
        // String name=sc.nextLine();
        // MyFunction(name);
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fact=Factorial(n);
        System.out.println(fact);
    }
}
