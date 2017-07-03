package Algorithms.Strings;

import java.util.*;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 3/7/17.
 */
public class TwoString {
    static String twoStrings(String s1, String s2){
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()){
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        }
        for (char ch : s2.toCharArray())
            if (map.containsKey(ch))
                count++;
        
        return count>0?"YES":"NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        in.close();
    }

}
