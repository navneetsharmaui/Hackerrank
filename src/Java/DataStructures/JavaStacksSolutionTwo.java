package Java.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 1/3/17.
 */
public class JavaStacksSolutionTwo {
    static boolean checkBrackets(String string, HashMap<Character, Character> map) {
        if ((string.length()%2) != 0) return false;

        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<string.length();i++) {
            Character c = string.charAt(i);
            if (map.containsKey(c)) stack.push(c);
            else if (stack.isEmpty() || c != map.get(stack.pop())) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String input = in.next();
            System.out.println(checkBrackets(input, map));
        }
    }
}
