package Algorithms.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class Gemstones {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Set<Character> gemstone = stringToSet(in.next());
        for (int i=1;i<q;i++) {
            String s = in.next();
            gemstone.retainAll(stringToSet(s));
        }
        System.out.println(gemstone.size());
    }

    private static Set<Character> stringToSet(String s) //Converts String to Character set
    {
        Set<Character> set = new HashSet<Character>(26);
        for (char c : s.toCharArray())
            set.add(c);
        return set;
    }
}
