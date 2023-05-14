import java.util.*;

public class ReverseString {
    public static void main(String args []){
        StringBuilder str=new StringBuilder("Hello");

        for (int i = 0; i < str.length()/2; i++) {

            char frontChar=str.charAt(i);
            char backChar=str.charAt(str.length()-i-1);

            str.setCharAt(str.length()-i-1, frontChar);
            str.setCharAt(i, backChar);
        }
        System.out.println(str);
    }

}
