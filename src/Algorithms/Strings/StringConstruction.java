package Algorithms.Strings;

import java.util.*;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 3/7/17.
 */
public class StringConstruction {
    static int stringConstruction(String s){
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else {
                map.put(ch, 1);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }

}
