package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 30/6/17.
 */
public class CatsAndAMouse {

    public static void main (String[] args) {
        Scanner in  =new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        x = Math.abs(x-z);
        y = Math.abs(y-z);
        System.out.println(x==y?"Mouse C":(x<y?"Cat A":"Cat B"));
    }
}
