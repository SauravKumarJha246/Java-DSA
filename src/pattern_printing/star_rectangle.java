package pattern_printing;
import java.util.Scanner;
public class star_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("entre number of row : ");
        int row = sc.nextInt();
        System.out.print("entre number of column : ");
        int col = sc.nextInt();
        for(int i=1 ; i<=row ; i++){
            for(int j=1 ; j<=col ; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
