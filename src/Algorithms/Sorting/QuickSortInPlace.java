package Algorithms.Sorting;

import java.util.*;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 3/7/17.
 */
public class QuickSortInPlace {
    static int partition (int[] arr, int low, int high) {
        int i=low-1;
        int pivot = arr[high];
        for (int j=low;j<high;j++) {
            if (arr[j]<=pivot) {
                i++;
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        int temp=arr[high];
        arr[high] = arr[i+1];
        arr[i+1]=temp;
        printArray(arr);
        return i+1;
    }
    static void quickSort (int[] arr, int low, int high) {
        if (low<high) {
            int p= partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i]=in.nextInt();
        in.close();
        quickSort(arr,0, n-1);
    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}
