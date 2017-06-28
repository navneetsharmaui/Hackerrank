package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by ryu on 28/6/17.
 */
public class DayOfProgrammer {
    static String solve(int year){
        int feb=28, day;
        String s="";
        if (year==1918) {
            s= "26.09."+year;
        } else if (year<1918) {
            if (year%4==0) {
                feb=29;
            }
            day=256-(215+feb);
            s= day+".09."+year;
        } else if (year>=1919) {
            if (year%400==0 || (year%4==0 && year%100!=0)) {
                feb=29;
            }
            day=256-(215+feb);
            s= day+".09."+year;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
