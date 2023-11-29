package Q2.Prog402aCl;

import Prog213b.Cl213b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prg402a"));
            System.out.println("Car Type\tBase Toll\tFactor\tCost");
            int id = 0;
            int score = 0;
            while (input.hasNext()) {
                id = input.nextInt();
                id = input.nextInt(); //finish this up
                Cl213b wowsa = new Cl213b(5);//change 5 to input later
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
