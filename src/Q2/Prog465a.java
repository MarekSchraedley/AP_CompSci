package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465a.dat"));
            int[][] list1 = new int[4][4];
            int[][] list2 = new int[4][4];
            int[][] largestElements = new int[4][4];
            for (int lcv = 0; lcv < list1.length; lcv++) {
                for (int lcv2 = 0; lcv2 < list1[0].length; lcv2++) {
                    list1[lcv][lcv2] = input.nextInt();
                    System.out.print(list1[lcv][lcv2] + " ");
                }
                System.out.println();
            }
            System.out.println();
            for (int lcv = 0; lcv < list2.length; lcv++) {
                for (int lcv2 = 0; lcv2 < list2[0].length; lcv2++) {
                    list2[lcv][lcv2] = input.nextInt();
                    System.out.print(list2[lcv][lcv2] + " ");
                }
                System.out.println();
            }
            System.out.println();
            for (int lcv = 0; lcv < list2.length; lcv++) {
                for (int lcv2 = 0; lcv2 < list2[0].length; lcv2++) {

                    largestElements[lcv][lcv2] = Math.max(list1[lcv][lcv2], list2[lcv][lcv2]);
                    System.out.print(largestElements[lcv][lcv2] + " ");
                }
                System.out.println();
            }



        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
