package Contests.WeekOfCode31;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ryu on 12/4/17.
 */
public class AccurateSorting {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t>0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i=0;i<n;i++) {
                a[i] = in.nextInt();
                b[i] = a[i];
            }
            int swap=0;
            for (int i=0;i<n-1;i++){
                if (Math.abs(a[i]-a[i+1])==1) {
                    if (a[i]>a[i+1]) {
                        swap=a[i];
                        a[i]=a[i+1];
                        a[i+1]=swap;
                    }
                }
            }
            Arrays.sort(b);
            System.out.println(Arrays.equals(a, b)?"Yes":"No");
            t--;
        }
    }
}
