package Java.DataStructures;

import java.util.*;
/**
 * Created by ryu on 1/3/17.
 */
public class JavaDequeue {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque          = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = map.size();

        for (int i = 0; i < n; i++) {

            if (i >= m) {
                int old = deque.remove();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.put(old, map.get(old) - 1);
                }
            }

            int num = scan.nextInt();
            deque.add(num);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            max = Math.max(max, map.size());
        }

        scan.close();
        System.out.println(max);
    }
}
