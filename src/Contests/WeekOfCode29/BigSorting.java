package Contests.WeekOfCode29;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 23/2/17.
 */
public class BigSorting {
    void swap(BigInteger[] arr,int i,int j)
    {
        BigInteger t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    int partition (BigInteger[] arr, int l, int h)
    {
        BigInteger x = arr[h];
        int i = (l - 1);

        for (int j = l; j <= h- 1; j++)
        {
            if (arr[j].compareTo(x) <= 0)
            {
                i++;

                swap(arr,i,j);
            }
        }

        swap(arr,i+1,h);
        return (i + 1);
    }

    void QuickSort(BigInteger[] arr, int l, int h)
    {
        int stack[] = new int[h-l+1];

        int top = -1;

        stack[++top] = l;
        stack[++top] = h;

        while (top >= 0)
        {
            h = stack[top--];
            l = stack[top--];

            int p = partition(arr, l, h);

            if ( p-1 > l )
            {
                stack[ ++top ] = l;
                stack[ ++top ] = p - 1;
            }

            if ( p+1 < h )
            {
                stack[ ++top ] = p + 1;
                stack[ ++top ] = h;
            }
        }
    }

    void printArr( BigInteger[] arr, int n )
    {
        int i;
        for ( i = 0; i < n; ++i )
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        BigSorting big = new BigSorting();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger[] unsorted = new BigInteger[n];
        for (int i=0;i<n;i++) unsorted[i] = in.nextBigInteger();

        big.QuickSort(unsorted, 0, n-1);
        big.printArr(unsorted, n);
    }
}
