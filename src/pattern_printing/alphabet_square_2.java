package pattern_printing;

import java.util.Scanner;

public class alphabet_square_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j =1; j<=n ; j++) {
                System.out.print((char) (j+96) + " ");
            }
            System.out.println();
        }
    }
}
