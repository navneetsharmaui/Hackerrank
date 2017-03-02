package Contests.WeekOfCode29;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by ryu on 2/3/17.
 */
public class MinimalDistanceToPi {


    static BigDecimal PI = new BigDecimal("3.14159265358979323846264338327950288419");

    static long[][] chain(BigDecimal x, long max) {
        List<long[]> fractions = new ArrayList<>();
        fractions.add(new long[]{0, 1});
        fractions.add(new long[]{1, 0});
        while(true) {
            String s = x.toString();
            int d = s.indexOf(".");
            int v = Integer.parseInt(s.substring(0, d));
            x = new BigDecimal("0" + s.substring(d));
            x = BigDecimal.ONE.divide(x, 38, 0);
            long[] f1 = fractions.get(fractions.size() - 1);
            long[] f2 = fractions.get(fractions.size() - 2);
            long[] f = new long[]{v * f1[0] + f2[0], v * f1[1] + f2[1]};
            if(f[1] > max) break;
            fractions.add(f);
        }
        return fractions.toArray(new long[fractions.size()][]);
    }

    static Context solvePrimitive(long min, long max) {
        Context context = new Context();
        context.checksLimit = 500000;
        long d = min;
        while(d <= max) {
            context.check(-1, d);
            d++;
        }
        System.out.println("" + context.bestN + "/" + context.bestD);
        return context;
    }

    static class Context {
        BigDecimal bestDelta = BigDecimal.ONE;
        long bestN;
        long bestD;

        int checksLimit = 100;
        int checks = 0;

        int bestCheck;

        public void check(long n, long d) {
            checks++;
            BigDecimal pid = PI.multiply(BigDecimal.valueOf(d));
            BigDecimal nb = new BigDecimal(pid.toString()).setScale(0, RoundingMode.HALF_UP);
            long n1 = nb.longValue();
            if(n < 0) n = n1;
            if(n1 != n) {
                n = n1;
//				throw new RuntimeException();
            }
            BigDecimal delta = pid.subtract(nb).abs().divide(BigDecimal.valueOf(d), 45, 0);
            if(delta.compareTo(bestDelta) < 0) {
                bestD = d;
                bestN = n;
                bestDelta = delta;
                bestCheck = checks;
            }
        }

        public boolean enough() {
            return checks > checksLimit;
        }
    }

    static void solve(long[] f1, long[] f2, long min, long max, Context context) {
        long d1 = f1[1];
        long d2 = f2[1];
        if(d1 >= min && d1 <= max) {
            context.check(f1[0], f1[1]);
        }
        long k = max / d1;
        if(k * d1 >= min) {
            context.check((f1[0] * k), (f1[1] * k));
        }
        while(k >= 0 && !context.enough()) {
            long k2 = (max - k * d1) / d2;
            long k2b = k2 - 1;
            long d = k * d1 + k2 * d2;
            if(d >= min && d <=max) {
                long n = k * f1[0] + k2 * f2[0];
                context.check(n, d);
            }
            k2 = (min - k * d1) / d2 + 1;
            if(k2 < 0) k2 = 0;
            long k2a = k2 + 1;
            d = k * d1 + k2 * d2;
            if(d >= min && d <= max) {
                long n = k * f1[0] + k2 * f2[0];
                context.check(n, d);
            }
            long k2c = k2a;
            while(k2c <= k2b) {
                d = k * d1 + k2c * d2;
                if(d >= min && d <= max) {
                    long n = k * f1[0] + k2c * f2[0];
                    context.check(n, d);
                }
                k2c++;
            }
            k--;
        }
    }

    static Context solve(long min, long max, int checksLimit) {
        if(max - min < 50000) {
            return solvePrimitive(min, max);
        }
        long[][] fractions = chain(PI, max);
        Context context = new Context();
        context.checksLimit = checksLimit;
        for (int i = fractions.length - 1; i >= 3 && !context.enough(); i--) {
            solve(fractions[i], fractions[i - 1], min, max, context);
        }
        System.out.println("" + context.bestN + "/" + context.bestD);
//		System.out.println(context.bestDelta + " " + context.bestCheck);
        return context;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long min = in.nextLong();
        long max = in.nextLong();
        solve(min, max, 20000);
    }
}
