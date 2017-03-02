package Contests.WeekOfCode29;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 2/3/17.
 */
public class BigSortingMethodTwo {

    static class strcmp implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int l1 = o1.length(), l2 = o2.length();
            return l1 > l2 ? 1 : (l2 > l1 ? -1 : o1.compareTo(o2));
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] unsorted = new String[n];
        for (int i = 0; i < n; i++) {
            unsorted[i] = in.readLine();
        }
        Arrays.sort(unsorted, new strcmp());
        for(String s : unsorted)
            System.out.println(s);
    }
}
