package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class JumpingOnTheClouds {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int e = 100;
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = in.nextInt();
        for (int i=0;i<n;i=i+k) {
            if (arr[i%n]==0)
                e-=1;
            else
                e-=3;
        }
        in.close();
        System.out.println(e);
    }
}
