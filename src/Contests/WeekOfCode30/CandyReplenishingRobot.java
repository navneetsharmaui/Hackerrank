package Contests.WeekOfCode30;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 17/3/17.
 */
public class CandyReplenishingRobot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int i=0; i < t; i++) c[i] = in.nextInt();
        int nw = n, sum=0;
        for (int i=0;i<t;i++) {
            nw = nw -c[i];
            if (nw < 5 && i<t-1) {
                sum = sum + (n-nw);
                nw = nw + (n-nw);
            }
        }
        System.out.println(sum);

    }
}
