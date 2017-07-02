package Contests.HackHour22;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class ParityGame {
    static int smallestSizeSubsequence(int n, int[] A, int sum) {
        if (sum%2==0)
            return 0;
        if (n==1) return -1;
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int sum = 0;
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            sum+=A[A_i];
        }
        int result = smallestSizeSubsequence(n, A, sum);
        System.out.println(result);
    }

}
