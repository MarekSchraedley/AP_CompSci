package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] list1 = new int[3][4];
            System.out.println("Original Table");
            for(int lcv = 0; lcv < list1.length; lcv++) {
                for (int lcv2 = 0; lcv2 < list1[0].length; lcv2++) {
                    list1[lcv][lcv2] = input.nextInt();
                    System.out.print(list1[lcv][lcv2] + " ");
                }
                System.out.println();
            }
            System.out.println("Row\tColumn");
            for(int lcv = 0; lcv < list1.length; lcv++) {
                for (int lcv2 = 0; lcv2 < list1[0].length; lcv2++) {
                    if (list1[lcv][lcv2] < 100) {
                        System.out.println((lcv+1) + "\t" + (lcv2+1));
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
