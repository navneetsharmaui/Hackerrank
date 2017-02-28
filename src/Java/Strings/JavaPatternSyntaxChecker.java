package Java.Strings;

import java.util.Scanner;
import java.util.regex.*;

/**
 * Created by ryu on 27/2/17.
 */
public class JavaPatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t>0) {
            String pattern = in.nextLine();
            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
            t--;
        }
    }
}
