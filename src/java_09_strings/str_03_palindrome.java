package java_09_strings;
import java.util.Scanner;

public class str_03_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("entre string: ");
        String s = sc.nextLine();
        boolean palindrome = true;

        for(int i=0 , j=s.length()-1 ; i<j ;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                palindrome = false;
                 break;
            }
            // System.out.print(palindrome);
        }
        System.out.print(palindrome);
    }
}
