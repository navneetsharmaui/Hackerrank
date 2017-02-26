package Java.Strings;

import java.io.*;
import java.util.*;
/**
 * Created by ryu on 26/2/17.
 */
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = new StringBuffer(A).reverse().toString();
        if (A.equals(B)) System.out.println("Yes");
        else System.out.println("No");
    }
}
