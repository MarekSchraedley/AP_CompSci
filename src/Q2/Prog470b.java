import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));
            System.out.println("Original matrix:");
            int[][] array = new int[5][5];
            int sum = 0;
            for (int lcv = 0; lcv < array.length; lcv++) {
                for (int lcv2 = 0; lcv2 < array[0].length; lcv2++) {
                    array[lcv][lcv2] = input.nextInt();
                    System.out.print(array[lcv][lcv2] + " ");
                }
                System.out.println();
            }
            System.out.print("\nMain Diagonal Sum ");
            for (int lcv = 0; lcv < array.length; lcv++) {
                sum += array[lcv][lcv];
            }
            System.out.println(sum);
            System.out.print("Other Diagonal Sum ");
            sum = 0;
            for (int lcv = 0; lcv < array.length; lcv++) {
                sum += array[lcv][4-lcv];
            }
            System.out.println(sum);


        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
