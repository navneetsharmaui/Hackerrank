package Java.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by ryu on 1/3/17.
 */
public class JavaStack {
    static boolean checkBrackets(String str) {
        Stack<String> stack = new Stack<String>();
        boolean isBalance = false;
        for (int i=0;i<str.length();i++) {
            String c="";
            c = c+str.charAt(i);
            if (c.equals("(") || c.equals("{") || c.equals("[")) stack.push(c);

            if (c.equals(")") || c.equals("}") || c.equals("]")) {
                if (stack.isEmpty()) return false;

                String peek = stack.peek();
                if (c.equals(")") && peek.equals("(")) stack.pop();
                else if (c.equals("}") && peek.equals("{")) stack.pop();
                else if (c.equals("]") && peek.equals("[")) stack.pop();
            }
        }
        if (str.length()>0 && stack.isEmpty()) isBalance=true;
        return isBalance;
    }
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(checkBrackets(input));
        }

    }
}
