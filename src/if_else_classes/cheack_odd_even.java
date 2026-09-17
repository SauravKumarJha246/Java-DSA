package if_else_classes;

import java.util.Scanner;

public class cheack_odd_even {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int x = sc.nextInt();
        if (x%2==0) {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
}
