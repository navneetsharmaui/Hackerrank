package Java.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 28/2/17.
 */
public class JavaRegexUsernameChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0) {
            String username = in.nextLine();
            String pattern = "^[a-zA-Z]\\w{7,29}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);
            if (m.find()) System.out.println("Valid");
            else System.out.println("Invalid");
        }
    }
}
