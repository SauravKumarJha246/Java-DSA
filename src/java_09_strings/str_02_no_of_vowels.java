package java_09_strings;

import java.util.Scanner;

public class str_02_no_of_vowels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre string: ");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count++;
        }
        System.out.println(count);
    }
}
