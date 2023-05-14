import java.util.*;
public class StringBuilders {
    public static void main(String args []){

        StringBuilder str=new StringBuilder("Hello");


        System.out.println(str.charAt(3));
        //charAt
        str.setCharAt(3, 'n');
        System.out.println(str);
        //insert
        str.insert(0, 'k');
        System.out.println(str);
        
        //delete
        str.delete(0,1);
        System.out.println(str);


        //append
        str.append("Hello");
        System.out.println(str);
    }

}
