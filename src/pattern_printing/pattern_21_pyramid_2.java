package pattern_printing;

import java.util.Scanner;

public class pattern_21_pyramid_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int nsp = n-1 , nst = 1;     // nsp=number of spaces, nst=number of star
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=nsp ; j++){
                System.out.print("  ");
            }
            for(int k= 1; k<=nst ; k++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }

    }
}

