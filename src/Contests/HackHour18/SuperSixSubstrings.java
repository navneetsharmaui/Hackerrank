package Contests.HackHour18;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 2/3/17.
 */
public class SuperSixSubstrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=0;
        String cache = "";
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                cache = cache+s.charAt(j);
                int numb = Integer.parseInt(cache);
                if(numb%6==0) count++;
                if (cache.charAt(0)=='0' && cache.length()>1 && numb%6==0) count--;
            }
            cache="";
        }
        System.out.println(count);
    }
}
