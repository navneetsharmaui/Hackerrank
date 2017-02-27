package Java.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by ryu on 27/2/17.
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] words = s.split("[ !,?\\._'@]+",0);
        int len = words.length;
        if (len==1&&words[0].equals("")) System.out.println(0);
        else {
            System.out.println(len);
            for (int i=0;i<len;i++) System.out.println(words[i]);
        }
    }
}
