package Java.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 28/2/17.
 */
public class JavaArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> inner = new ArrayList<Integer>();

        while (t-- > 0) {
            int n = in.nextInt();
            inner = new ArrayList<Integer>(n);
            while (n-- > 0) {
                int element = in.nextInt();
                inner.add(element);
            }
            outer.add(inner);
        }
        int q = in.nextInt();
        while (q-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int x = a-1;
            int y = b-1;
            if (a>outer.size() || b>outer.get(x).size()) System.out.println("ERROR!");
            else System.out.println(outer.get(x).get(y));
        }
    }
}
