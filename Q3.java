import java.util.*;
//Q1: TO REVERSE AN STRING
public class Q3 {
    public static String reverseWord(String str){
        String rstr = " ";
        char ch;
        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            rstr = ch + rstr;
        }
        return rstr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWord(str));
    }
}