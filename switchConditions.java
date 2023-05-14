import java.util.*;

public class switchConditions {
    public static void main(String [] args){
        System.out.println("Please choose a number from 1 to 3?");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        switch (num) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
        
            default:
                System.out.print("Invalid Number");
                break;
        }
    }
}
