package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465c.txt"));

            int[][] list1 = new int[input.nextInt()][input.nextInt()];
            int total = 0;
            System.out.println("Original Table");
            for(int lcv = 0; lcv < list1.length; lcv++) {
                for (int lcv2 = 0; lcv2 < list1[0].length; lcv2++) {
                    list1[lcv][lcv2] = input.nextInt();
                    System.out.print(list1[lcv][lcv2] + " ");
                    if (lcv == 0 || lcv == list1.length-1) total += list1[lcv][lcv2];
                    if (!(lcv == 0 || lcv == list1.length-1) && (lcv2 == 0 || lcv2 == list1[0].length-1)) total += list1[lcv][lcv2];
                }
                System.out.println();
            }
            System.out.println("\n The total of the edges is " + total);

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
