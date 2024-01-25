package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/"));
            int[][] array = new int[input.nextInt()][input.nextInt()];
            for (int lcv = 0; lcv < array.length; lcv++) {
                for (int lcv2 = 0; lcv2 < array[0].length; lcv2++) {
                    array[lcv][lcv2] = input.nextInt();
                    System.out.print(array[lcv][lcv2] + " ");
                }
                System.out.println();
            }
            for (int lcv = 0; lcv < array.length; lcv++) {
                for (int lcv2 = 0; lcv2 < array[0].length; lcv2++) {
                    if (array[lcv][lcv2] != 0) {
                        //print out info about nonzero number in array
                    }
                }
            }


        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
