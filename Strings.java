import java.util.*;

public class Strings {
    public static void main(String args[]){
        String sentence="Hi, This Syed Hassanul Haque";
        String substr=sentence.substring(5,sentence.length());


        // System.out.println(sentence);
        // System.out.println(substr);
        
        //Input of String
        // Scanner sc= new Scanner(System.in);
        // String name=sc.next();
        
        // System.out.println(name);

        String name1="Hassan";
        String name2="Hassan1";

        // if (name1==name2) {
        //     System.out.println("Strings are same");
        // }
        // else{
            
        //     System.out.println("Strings are not same");
        // }

            if(name1.equals(name2)){
                System.out.println("Strings are same");
            }
             else{
            
                    System.out.println("Strings are not same");
                 }
        
    }

}
