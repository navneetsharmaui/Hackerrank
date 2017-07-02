package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class AlternatingCharactersTw {
    static int alternatingCharacters(String s){
        int count = 1;
        int delete = 0;
        for (int i=1;i<s.length();i++) {
            if (s.charAt(i)!=s.charAt(i-1)) {
                delete+=count-1;
                count=1;
                continue;
            }
            count++;
        }
        delete+=count-1;
        return delete;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
        in.close();
    }

}
