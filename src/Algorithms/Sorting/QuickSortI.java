package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.*;
/**
 * Created by Navneet Sharma (navneetzz) ryu on 3/7/17.
 */
public class QuickSortI {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pivot = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<n;i++) {
            int num = in.nextInt();
            if (num<pivot) {
                System.out.print(num+" ");
            } else {
                list.add(num);
            }
        }
        System.out.print(pivot+" ");
        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
        in.close();
    }
}
