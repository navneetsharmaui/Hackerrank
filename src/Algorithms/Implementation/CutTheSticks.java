package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class CutTheSticks {
    static void cutTheSticks (int[] arr, int n) {
        int sticks = n;
        Arrays.sort(arr);
        int min = arr[0];
        int count=0;
        System.out.println(n);
        for (int i=0;i<n;i++) {
            if (min==arr[i])
                count++;
            else {
                sticks=sticks-count;
                count=1;
                min=arr[i];
                System.out.println(sticks);
            }
        }
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = in.nextInt();
        cutTheSticks(arr, n);
        in.close();
    }
}
