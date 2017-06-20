package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by ryu on 20/6/17.
 */
public class CamelCase {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        int count = 1;
        for (int i=0;i<s.length();i++) {
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        }
        System.out.println(count);
    }
}
