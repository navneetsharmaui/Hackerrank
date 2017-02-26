package Java.Introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 26/2/17.
 */
public class JavaLoopsTwo {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = 0;
            res  = res + a;
            for (int j=0;j<n;j++) {
                res = res + ((int)Math.pow(2, j)*b);
                System.out.print(res+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
