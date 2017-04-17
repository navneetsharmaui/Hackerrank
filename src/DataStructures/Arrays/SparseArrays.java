package DataStructures.Arrays;

import java.util.Scanner;

/**
 * Created by ryu on 17/4/17.
 */
public class SparseArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] words = new String[n];
        for (int i=0;i<n;i++) words[i] = in.next();
        int m = in.nextInt();
        String[] array = new String[m];
        for (int j=0;j<m;j++) array[j] = in.next();
        int count=0;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (array[i].equals(words[j])) count++;
            }
            System.out.println(count);
            count=0;
        }
    }
}
