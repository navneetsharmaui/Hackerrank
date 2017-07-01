package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class ModifiedKaprekarNumbers {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        boolean bool = false;
        if (n==1) {
            System.out.print(n+" ");
            bool=true;
        }
        for (long i=n;i<=m;i++) {
            long sq = i*i;
            String str = String.valueOf(sq);
            int len = str.length();
            if (len>1) {
                long left = Long.parseLong(str.substring(0, (int)Math.ceil(len/2)));
                long right = Long.parseLong(str.substring((int)Math.ceil(len/2), len));
                //System.out.println("left:"+left + " " +"right:"+right);
                if (left + right == i) {
                    System.out.print(i+" ");
                    bool=true;
                }
            }
        }
        if (!bool)
            System.out.println("INVALID RANGE");
        in.close();
    }
}
