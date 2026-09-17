package Loops;
import java.util.Scanner;
public class while_sum_of_number_and_its_reverse {
    public static void main(System[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int n = sc.nextInt();

        int r = 0;
        while(n != 0){
            r *= 10;
            r += n%10;
            n /= 10;
        }
        System.out.print(r);
    }

}
