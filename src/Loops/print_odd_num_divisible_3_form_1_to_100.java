package Loops;

public class print_odd_num_divisible_3_form_1_to_100 {
    static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i%2!=0 && i%3==0) System.out.print(i+" ");
        }
    }
}
