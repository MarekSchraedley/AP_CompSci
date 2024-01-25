package Q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog477a.dat"));
            int[][] array = new int[6][3];
            String[] letters = {"A", "B", "C", "D", "F", "Totals"};
            int gender = 0;
            int grade = 0;
            while (input.hasNext()) {
                gender = input.nextInt();
                grade = input.nextInt();
                array[grade-1][gender-1] += 1;
            }
            for (int lcv = 0; lcv < array.length-1; lcv++) {
                for (int lcv2 = 0; lcv2 < array[0].length-1; lcv2++) {
                    array[lcv][array[0].length-1] += array[lcv][lcv2];
                }
            }
            for (int lcv = 0; lcv < array.length-1; lcv++) {
                for (int lcv2 = 0; lcv2 < array[0].length; lcv2++) {
                    array[array.length-1][lcv2] += array[lcv][lcv2];
                }
            }
            System.out.println("Grade\tMale\tFemale\tTotal");
            for (int lcv = 0; lcv < array.length; lcv++) {
                System.out.print(letters[lcv] + "\t\t");
                for (int lcv2 = 0; lcv2 < array[0].length; lcv2++) {
                    System.out.print(array[lcv][lcv2] + "\t\t");
                }
                System.out.println();
            }


        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
