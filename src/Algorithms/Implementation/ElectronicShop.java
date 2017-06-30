package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 30/6/17.
 */
public class ElectronicShop {


    static int getMoneySpent(Integer[] keyboards, int[] drives, int s, int n , int m){
        int max=-1;
        Arrays.sort(keyboards, Collections.reverseOrder());
        Arrays.sort(drives);

        for (int i=0 , j=0;i<n;i++) {
            for (;j<m;j++) {
                if (keyboards[i]+drives[j]>s) break;
                if (keyboards[i]+drives[j]>max)
                    max=keyboards[i]+drives[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s, n , m);
        System.out.println(moneySpent);
        in.close();
    }
}
