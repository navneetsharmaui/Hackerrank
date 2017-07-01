package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class MarsExploration {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int len = s.length();
        int count = 0;
        for (int i=0;i<len;i=i+3) {
            int letter = 0;
            for (int j=i;j<i+3;j++) {
                switch (letter) {
                    case 0:
                        if (s.charAt(j)=='S')
                            count++;
                        break;
                    case 1:
                        if (s.charAt(j)=='O')
                            count++;
                        break;
                    case 2:
                        if (s.charAt(j)=='S')
                            count++;
                        break;
                }
                letter++;
            }
            letter=0;
        }
        System.out.println(len-count);
    }
}
