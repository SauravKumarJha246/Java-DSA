package pattern_printing;

import java.util.Scanner;

public class pattern_10_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("entre number of row : ");
        int m = sc.nextInt();
        System.out.print("entre number of column : ");
        int n = sc.nextInt();
        for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=n ; j++ ){
                if(i==1 || i==m || j==1 || j==n)
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
