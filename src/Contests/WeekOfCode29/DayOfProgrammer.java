package Contests.WeekOfCode29;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 23/2/17.
 */
public class DayOfProgrammer {
    private static void julianCalendar(int year) {
        int feb=28, day;
        if(year%4==0) {
            feb=29;
        }
        day=256-(215+feb);
        System.out.println(day+"."+"09"+"."+year);
    }
    private static void gregorianCalendar(int year) {
        int feb=28, day;
        if (year%400==0 || (year%4==0 && year%100!=0)) {
            feb=29;
        }
        day = 256-(215+feb);
        System.out.println(day+"."+"09"+"."+year);
    }
    private static void subtleYear(int year) {
        System.out.println("26.09."+year);
    }
    private static void checkYear(int year) {
        if (year < 1918) julianCalendar(year);
        else if (year >=1919) gregorianCalendar(year);
        else if (year==1918) subtleYear(year);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        checkYear(y);
    }
}
