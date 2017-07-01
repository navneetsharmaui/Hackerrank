package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class FindDigit {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i=0;i<q;i++) {
            String str = in.next();
            int[] arr = new int[str.length()];
            int n = Integer.parseInt(str);
            int j=0;
            while (n>0) {
                arr[j] = n%10;
                n = n/10;
                j++;
            }
            int count =0;
            int m = Integer.parseInt(str);
            for (int k=0;k<arr.length;k++) {
                if (arr[k]!=0) {
                    if (m%arr[k]==0)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
