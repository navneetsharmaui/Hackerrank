package Algorithms.Implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class SequenceEquation {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=1;i<=n;i++) {
            int m = in.nextInt();
            map.put(m, i);
        }
        for (int i=1;i<=n;i++) {
            System.out.println(map.get(map.get(i)));
        }
        in.close();
    }
}
