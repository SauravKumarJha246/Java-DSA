package Loops;
import java.util.Scanner;
public class while_sum_and_reverse_of_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int n = sc.nextInt();

        int sum = 0, r = 0;
        while(n != 0){
            sum += n%10;
            r *= 10;
            r += n%10;
            n /= 10;
        }
        System.out.print("sum of number are : ");
        System.out.println(sum);
        System.out.print("reverse of number are : ");
        System.out.print(r);


//        while(n != 0){
//            r *= 10;
//            r += r%10;
//            r /= 10;
//        }
//        System.out.print(r);
//        System.out.print("reverse of number are : ");

    }
}
