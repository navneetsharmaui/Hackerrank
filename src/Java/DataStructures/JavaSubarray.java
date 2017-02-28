package Java.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 28/2/17.
 */
public class JavaSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) a[i] = in.nextInt();
        in.close();
        int count=0, sum=0;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                sum+=a[j];
                if(sum<0) count++;
            }
            sum=0;
        }
        System.out.println(count);
    }
}
