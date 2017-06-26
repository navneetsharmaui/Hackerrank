package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by ryu on 26/6/17.
 */
public class TwoCharacters {
    static final int NOC = 26;
    public  static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        String s = in.next();
        in.close();

        if (len<=1) {
            System.out.println(0);
            return;
        }
        int[][] pair = new int[NOC][NOC];
        int[][] count = new int[NOC][NOC];
        char[] chArray = s.toCharArray();

        for (char ch : chArray) {
            int letterNum = ch-'a';

            for (int col=0;col<NOC;col++) {
                if (pair[letterNum][col]==ch)
                    count[letterNum][col]=-1;

                if (count[letterNum][col]!=-1) {
                    pair[letterNum][col]=ch;
                    count[letterNum][col]++;
                }
            }

            for (int row=0;row<NOC;row++) {
                if (pair[row][letterNum]==ch)
                    count[row][letterNum]=-1;

                if (count[row][letterNum]!=-1) {
                    pair[row][letterNum]=ch;
                    count[row][letterNum]++;
                }
            }
        }
        int max=0;
        for (int i=0;i<NOC;i++)
            for (int j=0;j<NOC;j++)
                max=Math.max(max, count[i][j]);

        System.out.println(max);
    }
}
