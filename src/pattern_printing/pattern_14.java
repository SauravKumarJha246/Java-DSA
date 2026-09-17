package pattern_printing;

import java.util.Scanner;
public class pattern_14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

//        for(int i=1 ; i<=n ; i++){
//            int a = 1;
//            for(int j=1 ; j<=i ; j++){
//                System.out.print(a  +" ");
//                a += 2;
//
//            }
//            System.out.println();
//        }

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=2*i-1 ; j +=2){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}



