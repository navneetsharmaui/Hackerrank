package Java.DataStructures;

import java.util.*;
import java.io.*;
/**
 * Created by ryu on 1/3/17.
 */
public class JavaMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map map = new HashMap();
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            String name=in.nextLine();
            int phone = Integer.parseInt(in.nextLine());
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s=in.nextLine();
            if (map.containsKey(s)) System.out.println(s+"="+map.get(s));
            else System.out.println("Not found");
        }
    }
}
