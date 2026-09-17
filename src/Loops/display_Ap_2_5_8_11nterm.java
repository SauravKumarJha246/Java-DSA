package Loops;

import java.util.Scanner;

public class display_Ap_2_5_8_11nterm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();
        for (int i=2; i<=3*n-1; i+=3 ){ // nth term = a+(n-1)d = 2+(n-1)3 = 2+3n-3 = 3n-1
            System.out.print(i+" ");
        }
    }
}
