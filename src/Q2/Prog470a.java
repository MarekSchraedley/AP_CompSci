package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));

            int[][] list1 = new int[6][5];
            int count = 0;
            System.out.println("Original Table");
            for(int lcv = 0; lcv < list1.length; lcv++) {
                for (int lcv2 = 0; lcv2 < list1[0].length; lcv2++) {
                    if (lcv == list1.length-1) {
                        list1[lcv][lcv2] = count;
                    } else {
                        list1[lcv][lcv2] = input.nextInt();
                    }
                    System.out.print(list1[lcv][lcv2] + " "); //finish this up

                }
                count = 0;
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
