package if_else_classes;

import java.util.Scanner;

public class check_triangle_or_not {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st side:" );
        int a = sc.nextInt();
        System.out.print("enter 2nd side :");
        int b = sc.nextInt();
        System.out.print("enter 3rd side :");
        int c = sc.nextInt();

        if (a+b>c && b+c>a && a+c>b)
            System.out.println("valid triangle");
        else
            System.out.println("invalid triangle");

    }
}
