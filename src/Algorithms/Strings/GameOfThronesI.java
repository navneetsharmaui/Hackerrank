package Algorithms.Strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class GameOfThronesI {
    static String gameOfThrones(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        }
        int odd = 0;
        for (Integer f : map.values()) {
            if (f%2!=0)
                odd++;
        }
        return odd>1?"NO":"YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
        in.close();
    }

}
