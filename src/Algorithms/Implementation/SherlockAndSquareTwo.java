package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class SherlockAndSquareTwo {
    static int numberOfSquares (int n, int m) {
        return (int) (Math.floor(Math.sqrt(m))-Math.ceil(Math.sqrt(n))+1);
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while (q>0) {
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(numberOfSquares(n, m));
            q--;
        }
        in.close();
    }
}
