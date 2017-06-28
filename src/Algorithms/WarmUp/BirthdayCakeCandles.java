package Algorithms.WarmUp;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ryu on 28/6/17.
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] a) {
        int max=Integer.MIN_VALUE;
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        /*for (int i=0;i<n;i++) {
            if (max<a[i])
                max=a[i];
            if (map.containsKey(a[i]))
                map.put(a[i], map.get(a[i])+1);
            else
                map.put(a[i], 1);
        }*/
        int max2 = Integer.MIN_VALUE;
        for (int j=0;j<n;j++) {
            if (max2<a[j]) {
                max2=a[j];
                count=0;
            }
            if (a[j]==max2)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) a[i] = in.nextInt();
        System.out.println(birthdayCakeCandles(n, a));
    }
}
