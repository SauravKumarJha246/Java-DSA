package java_07_sorting;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class sort_7_common_element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre size of arr1: ");
        int n = sc.nextInt();
        System.out.print("elements : ");
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
             arr1[i] = sc.nextInt();
        }
        System.out.print("entre size of arr2: ");
        int m = sc.nextInt();
        System.out.print("elements : ");
        int[] arr2= new int[m];
        for(int j=0;j<m;j++){
            arr2[j] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] result = new int[ans.size()];

        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        // Print result
        System.out.println("Common elements:");

        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
        sc.close();
          
    }
}
