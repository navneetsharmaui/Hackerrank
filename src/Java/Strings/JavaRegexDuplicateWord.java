package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ryu on 28/2/17.
 */
public class JavaRegexDuplicateWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regex = "(?i)\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);

        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        in.close();
    }
}
