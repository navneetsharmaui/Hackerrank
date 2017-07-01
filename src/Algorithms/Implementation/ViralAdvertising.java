package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */

public class ViralAdvertising {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int initial = 5;
        int count = initial/2;
        for (int i=1;i<n;i++) {
            initial = (initial/2)*3;
            count = count + (initial/2);
        }
        System.out.println(count);
    }
}
