import java.util.*;

public class ifelseConditions {
    
    public static void main(String [] args){
        System.out.println("Enter your age?");
        try (Scanner sc = new Scanner(System.in)) {
            int age=sc.nextInt();
            if(age>=18){
                System.out.print("Adult");
            }
            else{
                System.out.print("Not Adult");
            }
        }
    }
}
