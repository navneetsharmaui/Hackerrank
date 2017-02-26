package Java.Introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by ryu on 26/2/17.
 */
public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        int y = Integer.parseInt(year);
        int x = Integer.parseInt(month)-1;
        int z = Integer.parseInt(day);
        Calendar calendar = new GregorianCalendar(y, x, z);
        int dow = calendar.get(Calendar.DAY_OF_WEEK);
        if (dow==1) System.out.println("SUNDAY");
        else if (dow==2) System.out.println("MONDAY");
        else if (dow==3) System.out.println("TUESDAY");
        else if (dow==4) System.out.println("WEDNESDAY");
        else if (dow==5) System.out.println("THURSDAY");
        else if (dow==6) System.out.println("FRIDAY");
        else if (dow==7) System.out.println("SATURDAY");
    }
}
