package if_else_classes;

import java.util.Scanner;
public class four_digit_number {
    static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int x = sc.nextInt();
        if(x>999 && x<10000) System.out.print("four digit number");
        else System.out.print("not four digit number");
    }
}
