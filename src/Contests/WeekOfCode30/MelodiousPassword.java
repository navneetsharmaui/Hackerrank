package Contests.WeekOfCode30;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 15/3/17.
 */
public class MelodiousPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "abcdefghijklmnopqrstuvwxz";
        int n = in.nextInt();
        generatePermutations(str, n);

    }

    public static void generatePermutations(String str, int k){

        List permList = new LinkedList<String>();
        for(int j = 0; j < str.length(); j++){
            permList.add(str.charAt(j));
        }

        if (k>1) {
            do {

                for (int x = 0; x < str.length(); x++) {
                    int len = permList.get(0).toString().length();
                    char ch = permList.get(0).toString().charAt(len-1);
                    if ((isVowel(Character.toString(ch)) && isVowel(Character.toString(str.charAt(x))) != true) || (isVowel(Character.toString(ch)) != true && isVowel(Character.toString(str.charAt(x))))) {
                        String newElement = permList.get(0).toString() + str.charAt(x);
                        permList.add(newElement.toString());
                    }
                }
                permList.remove(0);

            } while (permList.get(0).toString().length() != k);
        }

        for (int i=0;i<permList.size();i++) System.out.println(permList.get(i));

    }
    public static boolean isVowel (String ch) {
        switch (ch) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": return true;
            default: return false;
        }
    }
}
