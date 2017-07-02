package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class FunnyString {
    static String funnyString(String s){
        int len = s.length();
        int count=1;
        for (int i=1;i<len;i++) {
            int first = Math.abs(((int)s.charAt(i)) -((int)s.charAt(i-1)));
            int second = Math.abs(((int)s.charAt(len-(i+1)))-((int)s.charAt(len-i)));
            if (first==second)
                count++;
        }
        return count==len?"Funny":"Not Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
        in.close();
    }

}
