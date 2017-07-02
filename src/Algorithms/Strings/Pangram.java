package Algorithms.Strings;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class Pangram {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (char ch: s.toLowerCase().toCharArray())
            if (!Character.isWhitespace(ch))
                    set.add(ch);

        System.out.println(set.size()==26?"pangram":"not pangram");
        in.close();
    }
}
