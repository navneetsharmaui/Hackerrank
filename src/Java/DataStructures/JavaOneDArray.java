package Java.DataStructures;

import java.util.*;
/**
 * Created by ryu on 28/2/17.
 */
public class JavaOneDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = in.nextInt();
        in.close();
        for(int i=0;i<n;i++) System.out.println(a[i]);
    }
}
