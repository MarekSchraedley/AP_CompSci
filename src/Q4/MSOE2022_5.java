package Q4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MSOE2022_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> Shells = new ArrayList<>();
        ArrayList<Integer> Buckets = new ArrayList<>();
        System.out.println("How many shells? ");
        int shells = input.nextInt();
        for (int lcv = 0; lcv < shells; lcv++) {
            Shells.add(input.nextInt());
        }
        boolean shellFits = false;
        while (Shells.size() > 0) {
            for (int lcv = Shells.size()-1; lcv >= 0; lcv--) {
                shellFits = false;
                int lcv2 = 0;
                while (shellFits == false && lcv < Buckets.size()) {
                    if (Buckets.get(lcv2) + Shells.get(lcv) <= 100) {
                        Buckets.set(lcv2, Buckets.get(lcv2) + Shells.get(lcv));
                        Shells.remove(lcv);
                        shellFits = true;
                    }
                    lcv2++;
                }
                if (shellFits == false) {
                    Buckets.add(Shells.get(lcv)); // doesent work, fix later
                    Shells.remove(lcv);
                    shellFits = true;

                }
            }
        }
        System.out.println(Buckets.size());




    }
}
