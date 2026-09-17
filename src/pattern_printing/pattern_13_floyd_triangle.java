package pattern_printing;

import java.util.Scanner;

public class pattern_13_floyd_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int a = 1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }
    }
}
