package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 30/6/17.
 */
public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int count = 0;
        int max = k;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (max<height[height_i]) {
                count = count + (height[height_i]-max);
                max = k + count;
            }
        }
        System.out.println(count);
        in.close();
    }
}
