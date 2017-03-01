package Java.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 28/2/17.
 */
public class JavaList {
    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            list.add(in.nextInt());
        }
        int n = in.nextInt();
        while (n-- > 0) {
            String string = in.next();
            int x, y;
            if (string.equals("Insert")) {
                x = in.nextInt();
                y = in.nextInt();
                list.add(x, y);
            } else if(string.equals("Delete")) {
                x = in.nextInt();
                list.remove(x);
            }
        }
        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
