package Java.BigNumber;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by ryu on 28/2/17.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
