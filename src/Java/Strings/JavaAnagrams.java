package Java.Strings;

import java.io.*;
import java.util.*;
/**
 * Created by ryu on 27/2/17.
 */
public class JavaAnagrams {

    static String sort(String s) {
        char[] array=s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    static boolean isAnagram(String a, String b) {
        if (a.length()==b.length()) {
            if (sort(a.toLowerCase()).equals(sort(b.toLowerCase()))) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
