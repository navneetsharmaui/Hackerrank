package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ryu on 26/6/17.
 */
public class Intro {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int len = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0;i<len;i++) {
            int n = in.nextInt();
            array.add(n);
        }
        System.out.println(array.indexOf(num));
    }
}
