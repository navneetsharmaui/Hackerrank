package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class SherlockAndSquares {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while (q>0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int count = 0;
            for (int i = n; i <= m; i++) {
                for (int j = 1; j * j <= i; j++) {
                    if (j * j == i)
                        count++;
                }
            }
            System.out.println(count);
            q--;
        }
        in.close();
    }
}
