package if_else_classes;

import java.util.Scanner;

public class divisible_by_five_or_not {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int x = sc.nextInt();
        if (x%5==0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("not divisible by 5");
        }
    }
}
