package Java.ExceptionHandling;

import java.util.*;
import java.util.Scanner;

/**
 * Created by ryu on 2/3/17.
 */
class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n<0 || p < 0) throw new Exception("n and p should be non-negative");
        else return (long) Math.pow(n, p);
    }
}

public class JavaExceptionHandlingTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while ( in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
