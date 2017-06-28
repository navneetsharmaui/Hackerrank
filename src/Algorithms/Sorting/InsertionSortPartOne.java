package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 28/6/17.
 */
public class InsertionSortPartOne {

    static void insertIntoSorted (int[] arr) {
        int n = arr.length;
        for (int i=1;i<n;i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
                printArray(arr);
            }
            arr[j+1]=key;
        }
        printArray(arr);
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        in.close();
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}
