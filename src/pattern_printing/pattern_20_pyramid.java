package pattern_printing;

import java.util.Scanner;

public class pattern_20_pyramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=n-i ; j++){
                System.out.print("  ");
            }
            for(int k= 1; k<=2*i-1 ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
