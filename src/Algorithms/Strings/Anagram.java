package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class Anagram {
    static int anagram(String s){
        int count = 0;
        int len = s.length();
        if (len%2!=0) return -1;
        String str1 = s.substring(0, len/2);
        String str2 = s.substring(len/2, len);
        for (char ch : str1.toCharArray()) {
            int index = str2.indexOf(ch);
            if (index==-1)
                count++;
            else
                str2 = str2.substring(0, index) + str2.substring(index+1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
        in.close();
    }

}
