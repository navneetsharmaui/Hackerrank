package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class MakingAnagram {
    static int makingAnagrams(String str1, String str2){
        int count = 0;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i=0;i<str1.length();i++) arr1[str1.charAt(i)-'a']++;
        for (int i=0;i<str2.length();i++) arr2[str2.charAt(i)-'a']++;
        for (int i=0;i<26;i++) count+=Math.abs(arr1[i]-arr2[i]);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }

}
