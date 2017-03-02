package Contests.WeekOfCode29;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 23/2/17.
 */
public class MegaPrime {
    public static boolean isPrimeNumber(int number) {
        if (number == 2 || number == 3 || number == 5 || number == 7 ) return true;

        return false;
    }

    void megaPrime(long n, long k)
    {
        boolean prime[] = new boolean[(int)n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;
        prime[1]=false;

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int count=0, countDigit=0, temp;
        for(int i = 2; i <= n; i++)
        {   int j, num=0;
            if (prime[i]) {
                j=i;
                while(j!=0) {
                    num=j%10;
                    if(prime[i]) {
                        prime[i]=isPrimeNumber(num);
                        if (num==1) prime[i] = false;
                        if (num==0) prime[i] = false;
                    }
                    j=j/10;
                }
            }
        }

        for(int i = (int)k; i <= n; i++)
        {
            if(prime[i] == true) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long first = in.nextLong();
        long last = in.nextLong();
        MegaPrime g = new MegaPrime();
        g.megaPrime(last, first);
    }
}
