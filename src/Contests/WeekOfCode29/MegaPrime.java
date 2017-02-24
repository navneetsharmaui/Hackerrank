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

        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;

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

        for(int i = 2; i <= n; i++)
        {   int j, num=0, num1=0;
            if (prime[i]) {
                j=i; temp=i;
                while(temp>0) {
                    temp=temp/10;
                    countDigit++;
                }
                if (countDigit==3) {
                    while(countDigit > 2) {
                        num=j%100;
                        if (prime[i]) {
                            prime[i]=isPrimeNumber(num);
                        }
                        num1=j/10;
                        if (prime[i]) {
                            prime[i]=isPrimeNumber(num1);
                        }
                        countDigit--;
                    }
                }
                /*if (countDigit==4) {
                    while(countDigit > 3) {
                        num=j%1000;
                        if (prime[i]) {
                            prime[i]=isPrimeNumber(num);
                        }
                        num1=j%100;
                        if (prime[i]) {
                            prime[i]=isPrimeNumber(num1);
                        }
                        num1=j/100;
                        if (prime[i]) prime[i]=isPrimeNumber(num1);
                        countDigit--;
                    }
                } */
            }
            countDigit=0;
        }

        for(int i = (int)k; i <= n; i++)
        {
            if(prime[i] == true) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long first = in.nextLong();
        long last = in.nextLong();
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + last);
        MegaPrime g = new MegaPrime();
        g.megaPrime(last, first);
    }
}
