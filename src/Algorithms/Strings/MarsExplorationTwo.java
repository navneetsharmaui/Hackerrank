package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class MarsExplorationTwo {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int pos=0;
        int count=0;
        for (char ch : s.toCharArray()) {
            if (pos%3==1)
                count+=(ch!='O')?1:0;
            else
                count+=(ch!='S')?1:0;
            pos++;
        }
        System.out.println(count);
    }
}
