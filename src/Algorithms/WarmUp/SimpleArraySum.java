package Algorithms.WarmUp;

import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 * Created by ryu on 25/2/17.
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int sum=0;
        while (t!=0) {
            int x = in.nextInt();
            sum=sum+x;
            t--;
        }
        System.out.println(sum);
    }
}
