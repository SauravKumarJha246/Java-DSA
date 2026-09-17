package if_else_classes;

import java.util.Scanner;

public class check_divisible_3_or_5 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int x = sc.nextInt();
        if (x%3==0 || x%5==0) System.out.print("divisible by 3 or 5");
        else System.out.print("not divisible by 3 or 5");
    }
}
