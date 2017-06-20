package Algorithms.Strings;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ryu on 20/6/17.
 */
public class SuperReduceStringsTwo {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (!stack.empty() && ch==stack.peek()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        String str = String.valueOf(stack);
        System.out.println(stack.empty()?"Empty String": str);
    }
}
