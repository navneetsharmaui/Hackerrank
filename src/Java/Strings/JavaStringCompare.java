package Java.Strings;

import java.io.*;
import java.util.*;

/**
 * Created by ryu on 26/2/17.
 */
public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        int t = in.nextInt();
        String min="", max="";
        for (int i=0;i<=string.length()-t;i++) {
            String substr = string.substring(i, i+t);
            if (substr.compareTo(min)<0 || min.isEmpty()) min=substr;
            if (substr.compareTo(max)>0 || max.isEmpty()) max=substr;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
