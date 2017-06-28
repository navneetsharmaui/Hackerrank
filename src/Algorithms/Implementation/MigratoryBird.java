package Algorithms.Implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 18/4/17.
 */
public class MigratoryBird {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0;i<n;i++) {
            int item = in.nextInt();
            hashMap.merge(item, 1, Integer::sum);
        }
        int max = hashMap.get(1), max_id=1;
        //System.out.println(max);
        for (int i=2;i<=5;i++) {
            if (hashMap.containsKey(i) && hashMap.get(i)>max) {
                max = hashMap.get(i);
                max_id=i;
            }
        }
        System.out.println(max_id);
    }
}
