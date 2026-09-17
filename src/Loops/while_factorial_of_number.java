package Loops;
import java.util.Scanner;
public class while_factorial_of_number {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

        if(n<0) System.out.print("not valid");
        else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.print("factorial is : ");
            System.out.println(fact);
        }
    }
}
