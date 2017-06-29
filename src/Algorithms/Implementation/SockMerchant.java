package Algorithms.Implementation;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 29/6/17.
 */
public class SockMerchant {
    static int sockMerchant (int n , int[] arr) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            if (!set.contains(arr[i]))
                set.add(arr[i]);
            else {
                count++;
                set.remove(arr[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
        in.close();
    }
}
