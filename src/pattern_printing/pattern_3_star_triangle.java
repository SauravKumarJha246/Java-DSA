package pattern_printing;

import java.util.Scanner;

public class pattern_3_star_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j =1; j<=i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
