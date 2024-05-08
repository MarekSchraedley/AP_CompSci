package Q4;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;

public class MSOE2021_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input target letter: ");
        String targetLetter = input.next();
        System.out.println("input amount of words: ");
        int words = input.nextInt();
        ArrayList<String> scentenceArr = new ArrayList<String>();
        for (int lcv = 0; lcv < words; lcv++) {
            scentenceArr.add(input.next());
        }
        boolean found = false;
        for (int lcv = 0; lcv < scentenceArr.size(); lcv++) {
            if (scentenceArr.get(lcv).substring(scentenceArr.get(lcv).length()-1).equals(targetLetter)) {
                System.out.println(scentenceArr.get(lcv));
                found = true;
            }
        }
        if (found = false) System.out.println("not found");



    }
}
