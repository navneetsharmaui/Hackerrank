package Algorithms.Sorting;

import java.util.*;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 5/7/17.
 */
public class CountingSortI {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[100];
        for (int i=0;i<n;i++) {
            int num = in.nextInt();
            arr[num]++;
        }
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        in.close();
    }
}
