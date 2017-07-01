package Algorithms.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class ExtraLongFactorials {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        BigInteger fact = new BigInteger("1");
        for (int i=1;i<=n;i++) {
            fact = fact.multiply(BigInteger.valueOf(Long.parseLong(String.valueOf(i))));
        }
        System.out.println(fact);
    }
}
