package Java.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 28/2/17.
 */
public class JavaOneDArrayPartTwo {
    private static boolean winOrLoose(int[] a, int m, int i, int n) {
        if (i<0||a[i]==1) return false;
        else if (i+1>=n || i+m>=n) return true;
        a[i]=1;
        return winOrLoose(a, m, i-1, n) || winOrLoose(a, m, i+1, n) || winOrLoose(a, m, i+m, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in .nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[n];
            for (int i=0;i<n;i++) a[i]=in.nextInt();
            System.out.println(winOrLoose(a, m, 0, n)? "YES" : "NO");
        }
    }
}
