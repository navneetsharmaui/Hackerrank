package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 30/6/17.
 */
public class CountingValleys {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String string = in.next();
        int level = 0;
        int valley = 0;
        boolean bool = false;
        for (int i=0;i<n;i++) {
            if (string.charAt(i)=='U')
                level++;
            else
                level--;

            if (!bool && level<0) {
                valley++;
                bool=true;
            }
            if (level>=0)
                bool=false;
        }
        System.out.println(valley);
        in.close();
    }
}
