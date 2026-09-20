package if_else_classes;

import java.util.Scanner;

public class check_area_parameter_of_rectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length:");
        double x = sc.nextDouble();
        System.out.print("enter breadth:");
        double y = sc.nextDouble();
        double a = x*y;
        System.out.println("area is : " + a);
        //System.out.println(a);
        double p = 2*(x+y);
        System.out.print("parameter is : " );
        System.out.println(p);
        if(a>p)
            System.out.println("area is grater");
        else
            System.out.println("parameter is grater ");
    }
}
