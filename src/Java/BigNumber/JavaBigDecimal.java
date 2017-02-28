package Java.BigNumber;

import java.math.BigDecimal;
import java.util.*;
/**
 * Created by ryu on 28/2/17.
 */
public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n+2];
        for (int i=0;i<n;i++) s[i]=in.next();
        in.close();
        s = Arrays.copyOf(s, n);
        Arrays.sort(s, (s1, s2) -> {
            BigDecimal b1 = new BigDecimal(s1);
            BigDecimal b2 = new BigDecimal(s2);
            return b2.compareTo(b1);
        });

        for (int i=0;i<n;i++) System.out.println(s[i]);
    }
}
