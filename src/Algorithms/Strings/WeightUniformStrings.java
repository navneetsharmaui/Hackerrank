package Algorithms.Strings;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
/* The use of HashSet is better than array list as it searches values in O(1) time which is very less
* compared to the ArrayList which does in O(n).
* */
public class WeightUniformStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int successive = 1;
        int lastNum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            int num = ch - 'a' + 1;
            if (num==lastNum)
                successive++;
            else {
                successive=1;
                lastNum=num;
            }
            int value = successive*num;
            set.add(value);
        }
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if (set.contains(x))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        in.close();
    }
}
