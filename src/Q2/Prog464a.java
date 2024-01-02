package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));

            int[][] mat = new int [5][6];
            int cntr = 0;
            int cntc = 0;
            for (int col = 0; col < mat.length; col++) {
                for (int col2 = 0; col2 < mat[0].length-1; col2++) {
                    mat[col][col2] = input.nextInt();
                }

            }
            for (int r = 0; r < mat.length; r++) {
                int rowbig = Integer.MIN_VALUE;
                for (int c = 0; c < mat[r].length-1; c++) {
                    if (mat[r][c]> rowbig)
                        rowbig = mat[r][c];

                }
                mat[r][5] = rowbig;
            }

            for(int[] row : mat) {
                for(int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
