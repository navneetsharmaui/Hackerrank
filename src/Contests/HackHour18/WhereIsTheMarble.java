package Contests.HackHour18;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 2/3/17.
 */
public class WhereIsTheMarble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int temp=m;
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a==temp) temp=b;
            else if (b==temp) temp=a;
        }
        System.out.println(temp);
    }
}
