package Q2.Prog402aCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prg402a"));

            while (input.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
