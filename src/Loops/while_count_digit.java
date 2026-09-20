package Loops;
import java.util.Scanner;
public class while_count_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre digit : ");
        int n = sc.nextInt();

        if (n == 0) ;   // just for 0 because on 0 code gives 0 digit but it is false on 0 no. of digit is 1
        int count = 0;
        while (n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
