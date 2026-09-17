package if_else_classes;

import java.util.Scanner;

public class three_input_greatest_of_them {
    static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st input : ");
        int x = sc.nextInt();
        System.out.print("enter 2nd input : ");
        int y = sc.nextInt();
        System.out.print("enter 3rd input : ");
        int z = sc.nextInt();

//        if (x>=y && y>=z){
//            System.out.println(x);
//        } else if (y>=x && x>=z) {
//            System.out.println(y);
//        }
//        else System.out.println(z);

        if (x>=y){
            if (y>=z) System.out.println(x);
            else System.out.println(z);
        }
        else {
            if (y>=z) System.out.println(y);
            else System.out.println(z);
        }


    }
}
