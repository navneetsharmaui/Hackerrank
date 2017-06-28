package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 28/6/17.
 */
public class CorrectnessAndLoopInvariant {

    static void insertionSort (int[] A) {
        int n = A.length;
        for (int i=1;i<n;i++) {
            int key = A[i];
            int j = i-1;
            while (j>=0 && A[j]>key) {
                A[j+1] =A[j];
                j=j-1;
            }
            A[j+1]=key;
        }
        printArray(A);
    }
    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
