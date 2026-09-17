package if_else_classes;

import java.util.Scanner;

public class check_integer_or_not {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        double x = sc.nextDouble(); //3.124

        double n = (int)x;  //3
        if (x-n == 0)
            System.out.print("integer");
        else
            System.out.print("not integer");

//        if(x == (int)x)
//            System.out.println("is integer number");
//        else
//            System.out.println("not integer number");

    }

}
