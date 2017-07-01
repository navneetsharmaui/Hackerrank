package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class AngryProfessor {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0;i<t;i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int count = 0;
            for (int j=0;j<n;j++) {
                int m = in.nextInt();
                if (m<=0)
                    count++;
            }
            if (count>=k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        in.close();
    }
}
