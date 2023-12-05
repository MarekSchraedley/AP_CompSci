package Q2.Prog410t;

import Q2.Prog214bcl.Cl214b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/survey.dat"));
            System.out.println("id\tincome\tmembers");
            while (input.hasNext()) {
                //Cl410t wowsa = new Cl410t();
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
