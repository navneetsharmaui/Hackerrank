package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 30/6/17.
 */
public class UtopianTree {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i=0;i<q;i++) {
            int n = in.nextInt();
            int height = 1;
            if (n==0)
                System.out.println(height);
            else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 0)
                        height++;
                    else
                        height = height * 2;
                }
                System.out.println(height);
            }
        }
        in.close();
    }
}
