package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by ryu on 20/6/17.
 */
public class SuperReduceStringOne {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer s = new StringBuffer(in.nextLine());

        for (int i=1;i<s.length();i++) {
            if (s.charAt(i)==s.charAt(i-1)) {
                s.delete(i-1, i+1);
                i=0;
            }
        }
        System.out.println(s.length()==0?"Empty String": s);
        in.close();
    }
}
