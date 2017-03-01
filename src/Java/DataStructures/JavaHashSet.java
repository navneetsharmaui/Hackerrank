package Java.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 1/3/17.
 */
public class JavaHashSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String[] pair_left=new String[t];
        String[] pair_right=new String[t];

        for (int i=0;i<t;i++) {
            pair_left[i]=in.next();
            pair_right[i]=in.next();
        }
        HashSet map =new HashSet();
        int count=0;
        for(int i=0;i<t;i++) {
            String set=pair_left[i]+" "+pair_right[i];
            if (map.size()==0 || map.contains(set)!= true) {
                map.add(set);
                count++;
            }
            System.out.println(count);
        }
    }
}
