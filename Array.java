import java.util.*;
public class Array {
    public static void main(String args []){
        //Simple Array
        // int marks []= new int [3];
        // marks[0]=78;
        // marks[1]=88;
        // marks[2]=98;

        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        
        //Array with variable size and linear search

        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int list []= new int [size];
        for (int i = 0; i < list.length; i++) {
            list[i]=sc.nextInt();

        }
        int search=sc.nextInt();
        for (int i = 0; i < list.length; i++) {
           if(search==list[i]){
               System.out.println("Number is found at index : "+ i);
           }
        }
    }
}
