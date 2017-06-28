package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 28/6/17.
 */
public class BreakingTheRecord {
    static int[] getRecord (int[] s) {
        int min = s[0];
        int max = s[0];
        int[] arr = {0, 0};
        int len = s.length;
        if (len<=1) {
            return arr;
        }
        for (int i=1;i<len;i++) {
            if (min>s[i]) {
                min=s[i];
                arr[1]++;
            }
            if (max<s[i]) {
                max=s[i];
                arr[0]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
        in.close();
    }
}
