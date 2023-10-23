package Lang213eClass;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213eClass {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213e.dat"));

            while (input.hasNext()) {
                int age = input.nextInt();
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
