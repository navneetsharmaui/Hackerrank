package Algorithms.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 6/7/17.
 */
public class TheFullCountingSort {
    public static void main (String[] args) throws IOException {
        int maxValue = 100;
        HashMap<Integer, ArrayList<String>> map = new HashMap<>(maxValue);
        for (int i=0;i<maxValue;i++)
            map.put(i, new ArrayList<String>());

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for (int i=0;i<n;i++) {
            String[] st = in.readLine().split(" ");
            int num = Integer.parseInt(st[0]);
            String s = (i<n/2)?"-":st[1];

            ArrayList<String> list = map.get(num);
            list.add(s);
        }
        StringBuffer str = new StringBuffer();
        for (int i=0;i<maxValue;i++) {
            ArrayList<String> values = map.get(i);
            for (String s : values) {
                str.append(s+" ");
            }
        }
        System.out.println(str);
        in.close();
    }
}
