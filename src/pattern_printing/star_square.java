package pattern_printing;
import java.util.Scanner;
public class star_square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
