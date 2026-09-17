package pattern_printing;

import java.util.Scanner;

public class pattern_15_vertically_flipped {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

//        for(int i=1 ; i<=n ; i++){
//            for(int j=1 ; j<=n ; j++){
//                if((i+j)>n)
//                System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=n-i ; j++){ // khali spaces wali loops
                System.out.print("  ");
            }
            for(int k= 1; k<=i ; k++){
                System.out.print("* "); // star wali loops
            }
            System.out.println();
        }

    }
}

