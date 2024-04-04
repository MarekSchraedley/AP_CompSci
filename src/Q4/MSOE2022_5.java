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




    }
}
