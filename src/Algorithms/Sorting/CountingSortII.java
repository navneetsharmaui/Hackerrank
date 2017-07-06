package Algorithms.Sorting;

import java.util.*;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 6/7/17.
 */
public class CountingSortII {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[100];
        for (int i=0;i<n;i++) {
            int num = in.nextInt();
            arr[num]++;
        }
        for (int i=0;i<100;i++) {
            for (int j=0;j<arr[i];j++)
                System.out.print(i+" ");
        }
    }
}
