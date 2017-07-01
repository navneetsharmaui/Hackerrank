package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class CaeserChipher {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str= in.next();
        int k = in.nextInt();
        for (int i=0;i<n;i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char ch = (char)(((int)str.charAt(i) + k - 65) % 26 + 65);
                System.out.print(ch);
            } else if (Character.isLowerCase(str.charAt(i))){
                char ch = (char)(((int)str.charAt(i) + k - 97) % 26 + 97);
                System.out.print(ch);
            } else {
                System.out.print(str.charAt(i));
            }
        }
        in.close();
    }
}
