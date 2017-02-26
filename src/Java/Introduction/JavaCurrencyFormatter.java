package Java.Introduction;

import java.util.*;
import java.text.*;
/**
 * Created by ryu on 26/2/17.
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usC = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnC = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frC = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inC = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

        String us = usC.format(payment);
        String india = inC.format(payment);
        String france = frC.format(payment);
        String china = cnC.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
