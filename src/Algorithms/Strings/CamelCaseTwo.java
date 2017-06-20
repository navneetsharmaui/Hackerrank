package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by ryu on 20/6/17.
 */
public class CamelCaseTwo {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] camelcases = s.split("[A-Z]");
        System.out.println(camelcases.length);
    }
}
