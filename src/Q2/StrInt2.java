package Q2;

import java.util.Locale;
import java.util.Scanner;

public class StrInt2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = kbd.nextLine().toUpperCase();
        String ab = "ABCDEFIGHIJKLMNOPQRSTUVWXYZ";
        int[] count = new int[26];

        for (int lcv = 0; lcv < str.length(); lcv++) {
            for (int lcv2 = 0; lcv2 < ab.length(); lcv2++) {
                if (str.substring(lcv, lcv + 1).equals(ab.substring(lcv2, lcv2+1)))
                    count[lcv2]++;

            }
        }
        int unique = 0;
        for (int n : count) {
            if (n > 0) unique++;
        }
        System.out.println("Unique letters: " + unique);
    }
}
