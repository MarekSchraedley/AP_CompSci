package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat"));
            while (input.hasNext()) {
                int count = 0;
                int[][] array = new int[input.nextInt()][input.nextInt()];
                for (int lcv = 0; lcv < array.length; lcv++) {
                    for (int lcv2 = 0; lcv2 < array[0].length; lcv2++) {
                        array[lcv][lcv2] = input.nextInt();
                        System.out.print(array[lcv][lcv2] + " ");
                        if (array[lcv][lcv2] != 0) count++;
                    }
                    System.out.println();
                }
                if (count * 3 <= array.length * array[0].length) {
                    for (int lcv = 0; lcv < array.length; lcv++) {
                        for (int lcv2 = 0; lcv2 < array[0].length; lcv2++) {
                            if (array[lcv][lcv2] != 0) {
                                System.out.println(lcv + " " + lcv2 + " " + array[lcv][lcv2]);
                            }
                        }
                    }
                    if (count * 3 == array.length * array[0].length) System.out.println("The Original Matrix And The Sparse Matrix Are Equally Abundant");
                    else System.out.println("The Original Matrix is Sparse");

                }  else System.out.println("The Original Matrix is Abundant");
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
