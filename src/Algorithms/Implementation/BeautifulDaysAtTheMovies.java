package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class BeautifulDaysAtTheMovies {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        for (int i1=i;i1<=j;i1++) {
            StringBuilder str  = new StringBuilder();
            str.append(i1);
            String string = str.reverse().toString();
            int rev = Integer.parseInt(string);
            //System.out.println(i1 + " " + rev);
            if (Math.abs(i1-rev)%k==0) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
