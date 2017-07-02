package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class HackerrankInAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int len = s.length();
            String st = "hackerrank";
            int len2 = st.length();
            if (len<len2)
                System.out.println("NO");
            else {
                int pos=0;
                for (int i=0;i<len;i++) {
                    if (pos<len2 && s.charAt(i)==st.charAt(pos))
                        pos++;
                }
                System.out.println(pos==len2?"YES":"NO");
            }
        }
    }
}
