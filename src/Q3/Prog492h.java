package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog492h {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog492h.dat"));
            String[][] array = new String[30][30];
            String temp = "";
            int neighbors = 0;
            System.out.println("Generation 0");
            for (int lcv = 0; lcv < 30; lcv++) {
                temp = input.next();
                for (int lcv2 = 0; lcv2 < 30; lcv2++) {
                    array[lcv][lcv2] = temp.substring(lcv2, lcv2+1);
                    System.out.print(array[lcv][lcv2] + " ");
                }
                System.out.println();
            }
            for (int count = 1; count <= 15; count++) {
                for (int lcv = 0; lcv < 30; lcv++) {
                    neighbors = 0;
                    for (int lcv2 = 0; lcv2 < 30; lcv2++) {

                    }
                }
            }





        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
