package Contests.WeekOfCode31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ryu on 12/4/17.
 */
public class ZeroOneGame {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for (int a0=0;a0<g;a0++) {
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i=0;i<n;i++) {
                list.add(i, in.nextInt());
            }
            int count=0;
            if (list.size()>2) {
                for (int i=1;i<list.size()-1;i++) {
                    if (list.get(i-1)==0 && list.get(i+1)==0) {
                        list.remove(i);
                        count++;
                        i=0;
                    }
                }
            }
            System.out.println(list);
            System.out.println(count%2==0?"Bob":"Alice");
        }
    }
}
