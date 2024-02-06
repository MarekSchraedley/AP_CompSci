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
            boolean isCell = false;
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
                for (int lcv = 1; lcv < 29; lcv++) {
                    for (int lcv2 = 1; lcv2 < 29; lcv2++) {
                        neighbors = 0;
                        isCell = false;
                        //finds neighbors and determines if isCell
                        for (int var1 = -1; var1 <= 1; var1++) {
                            for (int var2 = -1; var2 <= 1; var2++) {
                                if (array[lcv+var1][lcv2+var2].equals("*") || array[lcv+var1][lcv2+var2].equals("x")) {
                                    if (var1 == 0 && var2 == 0) {
                                        isCell = true;
                                    } else {
                                        neighbors++;
                                    }
                                }
                            }
                        }
                        if (!isCell && neighbors == 3) {
                            array[lcv][lcv2] = "o";
                        }
                        if (isCell && (neighbors == 0 || neighbors == 1)) {
                            array[lcv][lcv2] = "x";
                        }
                        if (isCell && neighbors >= 4) {
                            array[lcv][lcv2] = "x";
                        }
                    }
                }
                //updating deaths and births
                for (int lcv = 0; lcv < 30; lcv++) {
                    for (int lcv2 = 0; lcv2 < 30; lcv2++) {
                        if (array[lcv][lcv2] == "o") {
                            array[lcv][lcv2] = "*";
                        }
                        if (array[lcv][lcv2] == "x") {
                            array[lcv][lcv2] = ".";
                        }
                    }
                }
                //Printing the next screen
                System.out.println("Generation " + count);
                for (int lcv = 0; lcv < 30; lcv++) {
                    for (int lcv2 = 0; lcv2 < 30; lcv2++) {
                        System.out.print(array[lcv][lcv2] + " ");
                    }
                    System.out.println();
                }
            }





        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
