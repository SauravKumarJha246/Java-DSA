package java_10_oops;

import java.util.Scanner;
class Student{ //opps ka class bna hai(means data type bna hai)
        String name;
        int rno;
        double cgpa;
    }
public class opps_1 {
//    public static class Student{ //opps ka class bna hai(means data type bna hai)
//        String name;
//        int rno;
//        double cgpa;
//    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(); // object(declaration)
        s1.name = "saurav";
        s1.rno = 23;
        s1.cgpa = 7.5;

        Student s2 = new Student();
        s2.name = "subham";
        s2.rno = 13;
        s2.cgpa = 8.0;

        Student s3 = new Student();
        s3.name = "ram";
        s3.rno = sc.nextInt(); // input taking form user
        s3.cgpa = 9.0;

        System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
        s2.cgpa = 9.5; // change kiya hu
        System.out.println(s2.cgpa);
        System.out.println("s3 roll no is:"+ s3.rno);

    }
}
