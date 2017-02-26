package Java.Introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 26/2/17.
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1;
        while(in.hasNextLine()==true) {
            if(in.hasNext()==true) System.out.println(i+" "+in.nextLine());
            i++;
        }
    }
}
