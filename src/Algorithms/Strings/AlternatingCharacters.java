package Algorithms.Strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class AlternatingCharacters {
    static int alternatingCharacters(String s){
        int count = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) list.add(ch);
        for (int i=0;i<list.size()-1;i++) {
            if (list.get(i)==list.get(i+1)) {
                list.remove(i+1);
                count++;
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }

}
