package pattern_printing;

import java.util.Scanner;

public class pattern_7_opposite_trangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j =1; j<=n+1-i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
