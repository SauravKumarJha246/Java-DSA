package pattern_printing;

import java.util.Scanner;

public class pattern_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j =1; j<=n ; j++) {
                if (i%2 != 0) {
                    System.out.print((char) (i + 96) + " ");
                }
                else{
                    System.out.print((char) (i+64) + " ");
                }
            }
            System.out.println();
        }
    }
}
