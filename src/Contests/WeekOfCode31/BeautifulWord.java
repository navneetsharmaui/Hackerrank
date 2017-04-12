package Contests.WeekOfCode31;

import java.util.Scanner;

/**
 * Created by ryu on 12/4/17.
 */
public class BeautifulWord {
    public static boolean isVowel (char ch) {
        boolean bool = false;
        switch (ch) {
            case 'a':
                bool=true;
                break;
            case 'e':
                bool=true;
                break;
            case 'i':
                bool=true;
                break;
            case 'o':
                bool=true;
                break;
            case 'u':
                bool=true;
                break;
            case 'y':
                bool=true;
                break;
        }
        return bool;
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        int count =0;
        String word = w.toLowerCase();
        int len = word.length();
        for (int i=0;i<len-1;i++) {
            if (word.charAt(i)!=word.charAt(i+1)){
                if ((isVowel(word.charAt(i)) && !isVowel(word.charAt(i + 1)))|| (!isVowel(word.charAt(i)) && isVowel(word.charAt(i + 1)))|| (!isVowel(word.charAt(i)) && !isVowel(word.charAt(i + 1)))) {
                    count++;
                    if (i+1==len-1) count++;
                }
            }
        }
        System.out.println(count==len?"Yes":"No");
    }
}
