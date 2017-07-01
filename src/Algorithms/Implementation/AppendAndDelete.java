package Algorithms.Implementation;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 1/7/17.
 */
public class AppendAndDelete {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int k = in.nextInt();

        if (Objects.equals(s, t))
            System.out.println(k>=s.length()*2 || k%2==0?"Yes":"No");
        else {
            int match = 0;
            for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
                if (s.charAt(i) != t.charAt(i))
                    break;
                match++;
            }

            int nmcs = s.length()-match;
            int nmct = t.length()-match;

            System.out.println((nmcs+nmct==k)||(nmcs+nmct<k && (nmcs+nmct-k)%2==0)||(s.length()+t.length()<=k)?"Yes":"No");
        }
    }
}
