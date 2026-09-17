package Loops;

import java.util.Scanner;

public class a_power_of_b {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("enter number 2 : ");
        int b = sc.nextInt();

        int pow = 1;
        for(int i=1; i<=b ;i++)
            pow *= a;
            System.out.println("number 1 rasied to the power number 2 is "+pow);
    }
}
