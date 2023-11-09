package Q2.Prog435aCl;

import Prog213b.Cl213b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog435a.dat"));
            System.out.println("Car Type\tBase Toll\tFactor\tCost");
            while (input.hasNext()) {
                double car = input.nextInt();
                double gate = input.nextInt();
                Cl435a wowsa = new Cl435a(car, gate);
                wowsa.calc();
                System.out.println(wowsa.toString());
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
