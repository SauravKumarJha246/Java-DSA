package if_else_classes;
import java.util.Scanner;
public class check_quadrant {
    static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter X : ");
        double x = sc.nextDouble();
        System.out.print("enter Y : ");
        double y = sc.nextDouble();
        if (x==0 && y==0 ) System.out.println("at origin");
        else if(x>=0 && y>=0) System.out.println("lies in 1st quadrant");
        else if (x<=0 && y>=0) System.out.println("lies in 2nd quadrant");
        else if (x<=0 && y<=0) System.out.println("lies in 3rd quad");
        else if (x>=0 && y<=0) System.out.println("lies in 4th quad");



    }
}
