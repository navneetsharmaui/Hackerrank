package Java.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 26/2/17.
 */
public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1)+B.substring(1));
    }
}
