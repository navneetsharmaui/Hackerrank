package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 28/6/17.
 */
public class RunningTimeOfAlgorithm {
    
    static int insertIntoSorted (int[] arr) {
        int n = arr.length;
        int count=0;
        for (int i=1;i<n;i++) {
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j=j-1;
                count++;
            }
            arr[j+1]=key;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        in.close();
        System.out.println(insertIntoSorted(ar));
    }
}
