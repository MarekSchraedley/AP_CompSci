package Q3.Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.dat"));
            int vehicles = 0;
            int type = 0;
            String name = "";
            int tires = 0;
            while (input.hasNext()) {
                type = input.nextInt();
                name = input.next();
                tires = input.nextInt();
                if (type == 1) {
                    int worth = input.nextInt();
                } else if (type == 2) {
                    int miles = input.nextInt();
                } else if (type == 3) {
                    String home = input.next(); //finish the program
                }
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
