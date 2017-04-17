package DataStructures.Arrays;

import java.util.Scanner;

/**
 * Created by ryu on 17/4/17.
 */
public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rotations = in.nextInt();
        int[] b=new int[n];
        for (int i=0;i<n;i++) b[(i+n-rotations)%n] = in.nextInt();
        for (int i=0;i<n;i++) System.out.print(b[i]+" ");
    }
}
