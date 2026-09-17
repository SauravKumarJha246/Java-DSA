package if_else_classes;

import java.util.Scanner;

public class absolute_value_of_integer {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int x = sc.nextInt();
//        if (x >= 0) {
//            System.out.println(x);
//        } else {
//            System.out.println(-x);
        if (x<0) x = -x;
        System.out.print(x);

       }
    }
