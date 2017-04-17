package DataStructures.Arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ryu on 17/4/17.
 */
public class SparseArrayMethodTwo {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i=0;i<n;i++) {
            String string = in.next();
            hashMap.merge(string, 1, Integer::sum);
        }
        int m = in.nextInt();
        for (int i=0;i<m;i++){
            String string = in.next();
            System.out.println(hashMap.getOrDefault(string, 0));
        }
        in.close();
    }
}
